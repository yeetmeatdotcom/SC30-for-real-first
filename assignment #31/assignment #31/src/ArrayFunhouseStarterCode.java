


public class ArrayFunhouseStarterCode {

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
    //Remove val will replace the instance of particular numbers.
		//Returns an entire array
		public static int[] removeVal(int[] numArray, int val)
		{
            int count = 0;
            for (int num : numArray) {
                if (num == val) {
                    count++;
                }
            }
    
            int[] newArray = new int[numArray.length - count];
            int index = 0;
            for (int num : numArray) {
                if (num != val) {
                    newArray[index++] = num;
                }
            }
            return newArray;
		}
}