class Ball extends Shape {
    Ball(int x, int y, int size, int width, int height) {
        super(x, y, size, width, height);
    }

    void display() {
        pushMatrix();
        translate(x, y);
        rotate(angle);
        fill(cr, cg, cb);
        circle(0, 0, size);
        popMatrix();
    }
}

class Square extends Shape {
    Square(int x, int y, int size, int width, int height) {
        super(x, y, size, width, height);
    }

    void display() {
        pushMatrix();
        translate(x, y);
        rotate(angle);
        fill(cr, cg, cb);
        rectMode(CENTER);
        rect(0, 0, size, size);
        popMatrix();
    }
}

class Triangle extends Shape {
    Triangle(int x, int y, int size, int width, int height) {
        super(x, y, size, width, height);
    }

    void display() {
        pushMatrix();
        translate(x, y);
        rotate(angle);
        fill(cr, cg, cb);
        float halfSize = size / 2.0;
        beginShape();
        vertex(0, -halfSize);
        vertex(-halfSize, halfSize);
        vertex(halfSize, halfSize);
        endShape(CLOSE);
        popMatrix();
    }
}
