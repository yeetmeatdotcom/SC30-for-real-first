class Octagon extends Shape {
    Octagon(int x, int y, int size, int width, int height) {
        super(x, y, size, width, height);
    }

    void display() {
        pushMatrix();
        translate(x, y);
        rotate(angle);
        fill(cr, cg, cb);
        float angleIncrement = TWO_PI / 8;
        beginShape();
        for (float a = 0;