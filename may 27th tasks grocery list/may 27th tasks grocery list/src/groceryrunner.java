import java.util.ArrayList;

public class groceryrunner {
    public static void main(String[] args) {
        // Create an instance of GroceryList to use its method
        grocerylist groceryListCreator = new grocerylist();
        
        // Get the grocery list from the user
        ArrayList<String> groceryList = groceryListCreator.createGroceryList();
        
        // Print the grocery list
        System.out.println("\nYour Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
}
