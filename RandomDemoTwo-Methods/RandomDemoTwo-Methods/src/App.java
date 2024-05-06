import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        
        // System.out.println("Enter an integer: ");
        // int int1 = keys.nextDouble();

        // System.out.println("Enter another integer: ");
        // int int2 = keys.nextDouble();

        // System.out.println("Enter a decimal number: ");
        // int dbl1 = keys.nextDouble();

        // System.out.println("Enter a second decimal number: ");
        // int dbl2 = keys.nextDouble();


        for (int i = 0; i < 10; i++){
System.out.println("The number is: " + rdInt(2,17));
        }
    }

    //Custom Random Double Generator
    public static double rdDb1(double max){
        //generate random double between 0 and max
        double gen = Math.random() * max;
        
        return gen;
    }



    public static int rdInt(int min, int max){
max++; //add one to max to include it in the result

    //generate random double between 0 and max
    double gen = Math.random() * (max - min) + min;

    //Math.random() * 80 + 20 ----> nubmer between 20 and 100

    //Cast the double as an int to drop the decimals
    return (int) gen;
    }
}
