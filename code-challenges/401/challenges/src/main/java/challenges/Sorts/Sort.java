package challenges.Sorts;

import org.apache.commons.math3.exception.NullArgumentException;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    public static int[] mergeSort(int[] inputArr) {
        if (inputArr == null) {
            throw new NullArgumentException();
        }

        int length = inputArr.length;

        if (length > 1) {
            int mid = length / 2;

            // sort left
            int[] left = mergeSort(Arrays.copyOfRange(inputArr, 0, mid));

            // sort right
            int[] right = mergeSort(Arrays.copyOfRange(inputArr, mid, length));

            // merge together
            merge(left, right, inputArr);
        }

        return inputArr;
    }

    public static int[] merge(int[] left, int[] right, int[] inputArr) {
        int i = 0; // left iterator
        int j = 0; // right iterator
        int k = 0; // inputArr iterator

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                inputArr[k] = left[i];
                i++;
            } else {
                inputArr[k] = right[j];
                j++;
            }
            k++;
        }

        if (i == left.length) {
            System.arraycopy(right, j, inputArr, k, right.length);
        } else {
            System.arraycopy(left, i, inputArr, k, left.length);
        }

        return inputArr;
    }

    public static int[] quickSort(int[] inputArr, int left, int right) {
        if (left < right) {
            int position = partition(inputArr, left, right);

            quickSort(inputArr, left, position - 1);

            quickSort(inputArr, position + 1, right);
        }
        return inputArr;
    }

    public static int partition(int[] inputArr, int left, int right) {
        int pivot = inputArr[right];
        int low = left - 1;

        for (int i = left; i < right; i++) {
            if (inputArr[i] <= pivot) {
                low++;
                swap(inputArr, right, low + 1);
            }
        }

        swap(inputArr, right, low + 1);

        return low + 1;
    }

    public static void swap(int[] inputArr, int i, int low) {
        int temp = inputArr[i];
        inputArr[i] = inputArr[low];
        inputArr[low] = temp;
    }
}
