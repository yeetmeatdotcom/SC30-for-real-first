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