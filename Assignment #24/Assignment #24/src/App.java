
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
System.out.print("put any number to start: ");
int start = scanner.nextInt();


System.out.print("now put a stop number: ");
int stop = scanner.nextInt();

LoopStats beeb = new LoopStats(start, stop);
System.out.println("Total: " + beeb.Total());
System.out.println("Even Count: " + beeb.EvenCount());
System.out.println("Odd Count: " + beeb.OddCount());
scanner.close();

    } 
}
