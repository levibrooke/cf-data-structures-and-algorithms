package challenges.Sorts;

import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void insertionSort() {
        int[] sortThis = {3, 1, 4, 11, 18};

        int[] result = Sort.insertionSort(sortThis);

        int[] expected = {1, 3, 4, 11, 18};

        assertArrayEquals(expected, result);
    }

    @Test
    public void mergeSort() {
        int[] sortThis = {3, 1, 4, 11, 18};

        int[] result = Sort.mergeSort(sortThis);

        int[] expected = {1, 3, 4, 11, 18};

        assertArrayEquals(expected, result);
    }

    @Test (expected = NullArgumentException.class)
    public void mergeSortNull() {

        int[] result = Sort.mergeSort(null);

        int[] expected = {1, 3, 4, 11, 18};

        assertArrayEquals(expected, result);
    }
}