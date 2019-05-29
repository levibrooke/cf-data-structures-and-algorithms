package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testArrayShiftEven() {
        ArrayShift classUnderTest = new ArrayShift();

        int[] inputArr = {1, 2, 3, 4};
        int inputVal = 5;
        int[] expectedOutput = {1, 2, 5, 3, 4};

        assertArrayEquals("testing even length array should insert val at middle index",
                expectedOutput,
                classUnderTest.insertShiftArray(inputArr, inputVal));
    }

    @Test
    public void testArrayShiftOdd() {
        ArrayShift classUnderTest = new ArrayShift();

        int[] inputArr = {1, 2, 3, 4, 6};
        int inputVal = 5;
        int[] expectedOutput = {1, 2, 3, 5, 4, 6};

        assertArrayEquals("testing odd length array should insert val at middle index + 1",
                expectedOutput,
                classUnderTest.insertShiftArray(inputArr, inputVal));
    }
}