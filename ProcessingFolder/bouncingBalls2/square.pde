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