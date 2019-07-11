package challenges.RepeatedWord;

import java.util.Hashtable;

public class RepeatedWord {
    public static String findRepeat(String inputString) {
        String[] inputArr = inputString.split(" ");

        Hashtable wordsTable = new Hashtable();

        for (int i = 0; i < inputArr.length; i++) {
            if (wordsTable.containsKey(inputArr[i])) {
                return inputArr[i];
            } else {
                wordsTable.put(inputArr[i], 1);
            }
        }
        return null;
    }
}
