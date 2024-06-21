import java.util.ArrayList;
import java.util.Scanner;

public class runnerBlowling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        boolean doneEntering = false;





        while (!doneEntering) {
            System.out.print("Please enter the bowling score \"-1 to quit\": ");
            int score = scanner.nextInt();

            if (score == -1) {
                doneEntering = true;
            } else if (score >= 0 && score <= 300) {
                scores.add(score);
            }
        }





        int eliteCount = 0;
        int averageCount = 0;





        for (int score : scores) {
            if (score >= 200) {
                eliteCount++;
            } else {
                averageCount++;
            }
        }





        int Bowlers = eliteCount + averageCount;





        if (Bowlers > 0) {
            Elite elite = new Elite(eliteCount,Bowlers);
            Average average = new Average(averageCount,Bowlers);
            System.out.println("Elite Bowlers " + elite.getPercentage() + "%");
            System.out.println("Average Bowlers " + average.getPercentage() + "%");
        }




        
        scanner.close();
    }
}