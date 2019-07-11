package challenges.RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void findRepeat() {
        String input = "Once upon a time, there was a brave princess who...";

        String result = RepeatedWord.findRepeat(input);
        String expected = "a";

        assertEquals(expected, result);
    }

    @Test
    public void findRepeatNull() {
        String input = "Once upon a time, there was two people...";

        String result = RepeatedWord.findRepeat(input);
        String expected = null;

        assertEquals(expected, result);
    }
}