// not done























































import java.util.Arrays;

public class funhouserunner {
    public static void main(String[] args) throws Exception {
        // ARRAY NUMBER 1 ----------------------------------------
        int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        // Print the array for the user to view
        System.out.println(Arrays.toString(one));

        // Sum the values of positions listed (e.g. array[3] to array[6])
        System.out.println("sum of spots 3-6  =  " +ArrayFunhouseStarterCode.getSum(one, 3, 6));
        System.out.println("sum of spots 2-9  =  " +ArrayFunhouseStarterCode.getSum(one, 2, 9));

        // Count the number of occurrences of the number in the array
        System.out.println("# of 4s  =  " + ArrayFunhouseStarterCode.getCount(one, 4));
        System.out.println("# of 9s  =  " + ArrayFunhouseStarterCode.getCount(one, 9));
        System.out.println("# of 7s  =  " + ArrayFunhouseStarterCode.getCount(one, 7));
        
        
        
        
        
        
        System.out.println();
        System.out.println(); 
        System.out.println(); 
        System.out.println(); 
        
        


        // ARRAY NUMBER TWO ----------------------------------------
        int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

        // Print the array for the user to view
        System.out.println(Arrays.toString(two));

        // Sum the values of positions listed (e.g. array[3] to array[6])
        System.out.println("sum of spots 3-16  =  " + ArrayFunhouseStarterCode.getSum(two, 3, 16));
        System.out.println("sum of spots 2-9  =  " + ArrayFunhouseStarterCode.getSum(two, 2, 9));

        // Count the number of occurrences of the number in the array
        System.out.println("# of 4s  =  " + ArrayFunhouseStarterCode.getCount(two, 4));
        System.out.println("# of 9s  =  " + ArrayFunhouseStarterCode.getCount(two, 9));
        
    }
}