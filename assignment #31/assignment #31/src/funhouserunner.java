// not done























































import java.util.Arrays;

public class funhouserunner {
    public static void main(String[] args) throws Exception {
// ARRAY NUMBER TWO ----------------------------------------
        int[] two = {4, 2, 3, 4, 6, 7, 8, 9, 0, 10, 0, 1, 7, 6, 5, 3, 2, 9, 9, 8, 7};

        // Print the array for the user to view
        System.out.println("Array: " + Arrays.toString(two));

        // Sum up a section of the provided array
        int sumSection = getSum(two, 3, 9); // Sum elements from index 3 to 9
        System.out.println("Sum of elements from index 3 to 9: " + sumSection);

        // Count how many times a certain number occurs in the array
        int countNumber = countOccurrences(two, 7); // Count occurrences of number 7
        System.out.println("Number of occurrences of 7: " + countNumber);
    }

    public static int getSum(int[] numArray, int start, int end) {
        // Method to sum up a section of the provided array from index 'start' to 'end' (inclusive)
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    public static int countOccurrences(int[] numArray, int val) {
        // Method to count up how many times a certain number 'val' occurs in the array
        int count = 0;
        for (int num : numArray) {
            if (num == val) {
                count++;
            }
        }
        return count;
    }
    }
