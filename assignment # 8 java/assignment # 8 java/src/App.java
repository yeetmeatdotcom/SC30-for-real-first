import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        int intOne, intTwo; 
        double doubleOne, doubleTwo;
        
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
 
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();
 
        System.out.print("Enter a double :: ");
        doubleOne = keyboard.nextDouble();
 
        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();
 
        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);
        
        // Adding the integers
        int sumIntegers = intOne + intTwo;
        System.out.println("intOne + intTwo = " + sumIntegers);
        
        // Adding the doubles
        double sumDoubles = doubleOne + doubleTwo;
        System.out.println("doubleOne + doubleTwo = " + sumDoubles);
    }
}
