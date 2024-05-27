import java.util.ArrayList;
import java.util.Scanner;

public class grocerylist {
    // Method to create and return the grocery list
    public ArrayList<String> createGroceryList() {
        // Create a new Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store the grocery items
        ArrayList<String> groceryList = new ArrayList<>();
        
        // Boolean to control the loop
        boolean addingItems = true;
        
        // Loop to add items to the grocery list
        while (addingItems) {
            // Prompt the user to enter a grocery item
            System.out.print("Enter a grocery item: ");
            String item = scanner.nextLine();
            
            // Add the item to the grocery list
            groceryList.add(item);
            
            // Ask if the user wants to add more items
            System.out.print("Do you have more items to add? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            
            // Check if the user is done adding items
            if (response.equals("no")) {
                addingItems = false;
            }
        }
        
        // Close the scanner
        scanner.close();
        
        // Return the populated grocery list
        return groceryList;
    }
}