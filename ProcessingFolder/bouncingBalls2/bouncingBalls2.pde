ArrayList<Shape> shapes = new ArrayList<Shape>();
int bgColor; // Variable to store background color

void setup() {
    size(1700, 700);
    bgColor = color(70, 30, 50); // Initial background color
}

void draw() {
    background(bgColor);

    for (Shape shape : shapes) {
        shape.move();
        shape.spin();
        
        // Check collision with other shapes
        for (Shape otherShape : shapes) {
            if (shape != otherShape) {
                shape.checkCollision(otherShape);
            }
        }
        
        shape.display();
    }
}

void mousePressed() {
    // Random size between 30 and 100
    int randomSize = int(random(30, 100));
    
    // Randomly create a new ball, square, or triangle at the mouse position
    int shapeType = int(random(3)); // Random number between 0 and 2
    if (shapeType == 0) {
        shapes.add(new Ball(mouseX, mouseY, randomSize, width, height));
    } else if (shapeType == 1) {
        shapes.add(new Square(mouseX, mouseY, randomSize, width, height));
    } else if (shapeType == 2) {
        shapes.add(new Triangle(mouseX, mouseY, randomSize, width, height));
    }
    
    // Change the background color to a new random color
    bgColor = color(int(random(0, 255)), int(random(0, 255)), int(random(0, 255)));
}

abstract class Shape {
    int x, y, size; // Position and size
    int cr, cg, cb; // RGB values
    int dx, dy; // Velocity
    int width, height; // Screen dimensions
    float angle; // Rotation angle

    Shape(int x, int y, int size, int width, int height) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.width = width;
        this.height = height;
        this.angle = random(TWO_PI); // Initial random angle

        // Randomize color values
        cr = int(random(0, 255));
        cg = int(random(0, 255));
        cb = int(random(0, 255));

        // Set velocity
        dx = int(random(-10, 10));
        dy = int(random(-10, 10));
    }

    abstract void display();

    void move() {
        // Apply velocity
        x += dx;
        y += dy;

        // Bounce off edges
        if (x <= 0 + size / 2 || x >= width - size / 2) {
            dx *= -1;
        }
        if (y <= 0 + size / 2 || y >= height - size / 2) {
            dy *= -1;
        }
    }

    void spin() {
        angle += 0.05; // Increment the rotation angle
    }

    void checkCollision(Shape other) {
        float distance = dist(x, y, other.x, other.y);

        if (distance < (this.size + other.size) / 2) {
            int tempDx = dx;
            int tempDy = dy;

            // Swap velocities
            dx = other.dx;
            dy = other.dy;

            other.dx = tempDx;
            other.dy = tempDy;
        }
    }
}