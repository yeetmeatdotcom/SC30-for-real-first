import java.util.ArrayList;
import java.util.Collections;

public class reverseraffle {
    public static void main(String[] args) throws Exception {
         // initialize the list with at least 10 names
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "matthew", "Bob", "John", "Rich", "Mark", "luke", "Mary", "Jason", "Larry", "stanley");

        // explaining the game
        System.out.println("game called Reverse Raffle Draw!");
        System.out.println("the name drawn from the hat does NOT win.");
        System.out.println("last name drawn will be the actual winner.\n");

        // simulate the reverse raffle draw
        while (names.size() > 1) {

            // randomly pick and remove a name
            int index = (int) (Math.random() * names.size());
            String removedName = names.remove(index);

            // output the name that has been removed
            System.out.println("Name removed: " + removedName);

            // delay to create space between picks
            Thread.sleep(111);
        }

        // announce the winner
        String winner = names.get(0);
        System.out.println("\n Congratulations! The winner is: " + winner);
    }
}
