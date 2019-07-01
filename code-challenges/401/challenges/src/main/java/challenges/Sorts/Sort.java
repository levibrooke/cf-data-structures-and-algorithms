package challenges.Sorts;

public class Sort {

    public static int[] insertionSort(int[] inputArr) {

        for (int i = 1; i < inputArr.length; i++) {
            int j = i - 1;
            int temp = inputArr[i];

            while (j >= 0 && temp < inputArr[j]) {
                inputArr[j + 1] = inputArr[j];
                j = j - 1;
            }

            inputArr[j + 1] = temp;
        }
        return inputArr;
    }
}
