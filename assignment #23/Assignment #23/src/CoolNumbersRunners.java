import java.util.Scanner;

public class CoolNumbersRunners {
    public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the stop value: ");
		int stop = scanner.nextInt();

		System.out.println(CoolNumber.countCoolNumbers(stop) + " cool numbers between 6 - " + stop);
		scanner.close();
	}
}