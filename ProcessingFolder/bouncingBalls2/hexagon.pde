class Hexagon extends Shape {
    Hexagon(int x, int y, int size, int width, int height) {
        super(x, y, size, width, height);
    }

    void display() {
        pushMatrix();
        translate(x, y);
        rotate(angle);
        fill(cr, cg, cb);
        float angleIncrement = TWO_PI / 6;
        beginShape();
        for (float a = 0; a < TWO_PI; a += angleIncrement) {
            float sx = cos(a) * size / 2;
            float sy = sin(a) * size / 2;
            vertex(sx, sy);
        }
        endShape(CLOSE);
        popMatrix();
    }
}