public class App {
    public static void main(String[] args) throws Exception {
        
        // // Declaring Arrays
        // int[] highscore = null;
        // String[] names = null;

        // // Create the array
        // highscore = new int[5];
        // names = new String[5];

        // // Set initial values invidiually
        // highscore[0] = 99;
        // names[0] = "george";

        // Declare, Create, and intialize at the same time
        int[] highscore = {99,98,98,88,68};
        String[] names = {"g","fred","wolf","fox","sutter"};

        System.out.println("The length is: " + names.length);

        //How you did it in python
        //for item in names:
        //    do something

        //for item in highscore
        //    do something

        // Default for loop to access ANY array
        for (int i=0; i <highscore.length; i++){
            System.out.println("Item # " + i + " is " + highscore[i]);
            System.out.println("name # " + i + " is " + names[i] + "\n");
        }
        // default loop to go through an array backwards
        for (int i= highscore.length -1; i >= 0; i --){
            System.out.println("Item # " + i + " is " + highscore[i]);
            System.out.println("name # " + i + " is " + names[i] + "\n");
        }
    }
}
