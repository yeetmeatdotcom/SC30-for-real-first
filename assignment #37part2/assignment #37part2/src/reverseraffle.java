import java.util.ArrayList;
import java.util.Scanner;

public class reverseraffle {
    private ArrayList<String> names;

    public reverseraffle() {
        this.names = new ArrayList<>();
    }

    public void addName(String name) {
        if (!name.trim().isEmpty()) {
            names.add(name.trim());
        }
    }

    public void startRaffle() throws InterruptedException {
        // Explaining the game
        System.out.println("\nGame called Reverse Raffle Draw!");
        System.out.println("The name drawn from the hat does NOT win.");
        System.out.println("The last name drawn will be the actual winner.\n");

        // Simulate the reverse raffle draw
        while (names.size() > 1) {
            // Randomly pick and remove a name
            int index = (int) (Math.random() * names.size());
            String removedName = names.remove(index);

            // Output the name that has been removed
            System.out.println("Name removed: " + removedName);

            // Delay to create space between picks
            Thread.sleep(111);
        }

        // Announce the winner
        if (names.size() == 1) {
            String winner = names.get(0);
            System.out.println("\nCongratulations! The winner is: " + winner);
        } else {
            System.out.println("No names were added to the raffle.");
        }
    }

    public void inputNames() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get at least 10 names from the user
        System.out.println("Please enter at least 10 names for the raffle (enter 'done' to finish):");
        while (names.size() < 10) {
            System.out.print("Enter name #" + (names.size() + 1) + ": ");
            String name = scanner.nextLine();
            if (!name.trim().isEmpty() && !name.equalsIgnoreCase("done")) {
                names.add(name.trim());
            } else if (name.equalsIgnoreCase("done")) {
                System.out.println("You must enter at least 10 names.");
            }
        }

        // Additional names if user wants to enter more
        System.out.println("You can keep adding names or type 'done' to start the raffle:");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            } else if (!name.trim().isEmpty()) {
                names.add(name.trim());
            }
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of reverseraffle and start the raffle
        reverseraffle raffle = new reverseraffle();
        raffle.inputNames();
        raffle.startRaffle();
    }
}