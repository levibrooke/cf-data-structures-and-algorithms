import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));

    // calling betterReverseArray
    int[] result = betterReverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(result));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    int arrayLength = inputArray.length;
    int[] newArray = new int[arrayLength];
    int reverseIndex = arrayLength;

    for (int i = 0; i < arrayLength; i++) {
      newArray[reverseIndex - 1] = inputArray[i];
      reverseIndex = reverseIndex - 1;
    }

    // for now, to make sure that it compiles, here is a bad answer
    return newArray;
  }

  public static int[] betterReverseArray(int[] inputArray) {
    // set a beginning and end point
    // create temp var
    // set temp to index 0 val
    // set index 0 to value of last index
    // last index gets temp
    // increment beginning iterator, decrement ending iterator

    int front = 0;
    int end = inputArray.length - 1;

    while (front <= end) {
      int temp = inputArray[front];
      inputArray[front] = inputArray[end];
      inputArray[end] = temp;
      front++;
      end--;
    }
    return inputArray;
  }
    
}