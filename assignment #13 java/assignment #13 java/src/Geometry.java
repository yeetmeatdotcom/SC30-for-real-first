public class Geometry {

    // Perimeter of a rectangle
    public void perimeter(double len, double wid) {

        double perimeter = 2*( len + wid );
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    // Surface area of a cube
    public void surfaceArea(double side) {

        double surfaceArea = 6*side*side;
        System.out.println("Surface area of the cube: " + surfaceArea);
    }

    // Area of a circle
    public void circleArea(double radius) {

        double circleArea = 3.14 * radius*radius;
        System.out.println("Area of the circle: " + circleArea);
    }

}
