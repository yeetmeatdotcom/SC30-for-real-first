
import java.util.Arrays;

public class ArrayFunhouseStarterCode {
    public static void main(String args[]) 
    {
        // ARRAY NUMBER 1 ----------------------------------------
        int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        // Print the array for the user to view
        System.out.println(Arrays.toString(one));

        // Sum the values of positions listed (e.g. array[3] to array[6])
        System.out.println("sum of spots 3-6  =  " + getSum(one, 3, 6));
        System.out.println("sum of spots 2-9  =  " + getSum(one, 2, 9));

        // Count the number of occurrences of the number in the array
        System.out.println("# of 4s  =  " + getCount(one, 4));
        System.out.println("# of 9s  =  " + getCount(one, 9));
        System.out.println("# of 7s  =  " + getCount(one, 7));
        
        
        
        
        
        
        System.out.println();
        System.out.println(); 
        System.out.println(); 
        System.out.println(); 
        
        


        // ARRAY NUMBER TWO ----------------------------------------
        int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

        // Print the array for the user to view
        System.out.println(Arrays.toString(two));

        // Sum the values of positions listed (e.g. array[3] to array[6])
        System.out.println("sum of spots 3-16  =  " + getSum(two, 3, 16));
        System.out.println("sum of spots 2-9  =  " + getSum(two, 2, 9));

        // Count the number of occurrences of the number in the array
        System.out.println("# of 4s  =  " + getCount(two, 4));
        System.out.println("# of 9s  =  " + getCount(two, 9));
        
    }

    // METHODS/FUNCTIONS INSTEAD OF A SECOND FILE ----------------------------------------

    // getSum() will return the sum of the numbers from start to stop, inclusive
    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    // getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val) {
        int count = 0;
        for (int num : numArray) {
            if (num == val) {
                count++;
            }
        }
        return count;
    }
}