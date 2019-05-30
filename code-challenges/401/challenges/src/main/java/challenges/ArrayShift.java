package challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int inputVal) {
        int[] newArray = new int[inputArray.length + 1];
        int insertPoint = (int) Math.ceil(newArray.length / 2);

        for (int i = 0; i < newArray.length; i++) {
            if (i < insertPoint) {
                newArray[i] = inputArray[i];
            }
            else if (i == insertPoint) {
                newArray[i] = inputVal;
            }
            else if (i > insertPoint) {
                newArray[i] = inputArray[i - 1];
            }
        }
        return newArray;
    }
}