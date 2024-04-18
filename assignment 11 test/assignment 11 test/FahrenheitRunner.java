// FahrenheitRunner.java
public class FahrenheitRunner {
	public static void main(String[] args) throws Exception {
        // Test cases
        Fahrenheit temp1 = new Fahrenheit();
        temp1.setFahrenheit(98.6);
        System.out.print("98.6°F in Celsius: ");
        temp1.print();

        Fahrenheit temp2 = new Fahrenheit();
        temp2.setFahrenheit(212);
        System.out.print("212°F in Celsius: ");
        temp2.print();
    }
}
