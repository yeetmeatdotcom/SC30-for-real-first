import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = keys.nextInt();
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = str.nextLine();
        System.out.println(num + "\t " + sentence);
    }
}
