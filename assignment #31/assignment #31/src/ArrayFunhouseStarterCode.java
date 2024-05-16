// sorry its not done don't look at it






























































import java.util.Arrays;

public class ArrayFunhouseStarterCode {
    public static void main(String args[]) {
        // ARRAY NUMBER 1 ----------------------------------------
        int[] one = {4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        // Print the array for the user to view
        System.out.println(Arrays.toString(one));

        // Sum the values of positions listed (e.g. array[3] to array[6])
        System.out.println("sum of spots 3-6  =  " + getSum(one, 3, 6));
        System.out.println("sum of spots 2-9  =  " + getSum(one, 2, 9));

        // Count the number of occurrences of the number in the array
        System.out.println("# of 4s  =  " + getCount(one, 4));
        System.out.println("# of 9s  =  " + getCount(one, 9));
        System.out.println("# of 7s = " + getCount(one, 7));


 // Remove all occurrences of 7 from the array and print the result
 int[] oneWithout7 = removeVal(one, 7);
 System.out.println("new array with all 7s removed = " + Arrays.toString(oneWithout7));
 System.out.println("# of 7s = " + getCount(oneWithout7, 7));


        // ARRAY NUMBER TWO ----------------------------------------
        int[] two = {4, 2, 3, 4, 6, 7, 8, 9, 0, 10, 0, 1, 7, 6, 5, 3, 2, 9, 9, 8, 7};

        // Print the array for the user to view
        System.out.println(Arrays.toString(two));

        // Sum the values of positions listed (e.g. array[3] to array[16])
        System.out.println("sum of spots 3-16  =  " + getSum(two, 3, 16));
        System.out.println("sum of spots 2-9  =  " + getSum(two, 2, 9));

        // Count the number of occurrences of the number in the array
        System.out.println("# of 0s  =  " + getCount(two, 0));
        System.out.println("# of 3s  =  " + getCount(two, 3));
        System.out.println("# of 7s = " + getCount(two, 7));

        // Remove all occurrences of 7 from the array and print the result
        int[] twoWithout7 = removeVal(two, 7);
        System.out.println("new array with all 7s removed = " + Arrays.toString(twoWithout7));
        System.out.println("# of 7s = " + getCount(twoWithout7, 7));

    }

    // getSum() will return the sum of the numbers from start to stop, not including stop
    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    // getCount() will return the number of times val is present
    public static int getCount(int[] numArray, int val) {
        int count = 0;
        for (int num : numArray) {
            if (num == val) {
                count++;
            }
        }
        return count;
    }

    // removeVal() will remove all occurrences of val from the array
    public static int[] removeVal(int[] numArray, int val) {
        int newSize = numArray.length - getCount(numArray, val); // New size of the array after removing val
        int[] newArray = new int[newSize];
        int newIndex = 0;
        for (int num : numArray) {
            if (num != val) {
                newArray[newIndex] = num;
                newIndex++;
            }
        }
        return newArray;
    }
    
}
