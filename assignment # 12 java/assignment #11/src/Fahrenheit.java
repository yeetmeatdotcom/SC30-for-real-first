// Fahrenheit.java
public class Fahrenheit {
    private double fahrenheit;

    public void setFahrenheit(double fahren) {
        fahrenheit = fahren;
    }

    public double getCelsius() {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public void print() {
        System.out.println(getCelsius() + "°C");
    }
}
