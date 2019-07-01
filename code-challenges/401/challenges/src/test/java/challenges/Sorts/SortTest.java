package challenges.Sorts;

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
}