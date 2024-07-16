import java.util.*;

public class removeDuplicate {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = { 2, 7, 1, 5, 8, 47, 10, 8, 1, 40, 47, 5 };
    //step 1 sort the array
    Arrays.sort(arr);
    //step 2 delete all the duplicate values
    int j = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      // If current element is not equal to next element
      // then store that current element
      if (arr[i] != arr[i + 1]) {
        arr[j++] = arr[i];
      }
    }
      // Store the last element as whether it is unique or
      // repeated, it hasn't stored previously
    arr[j++] = arr[arr.length - 1];

    //step 3 Create new array of unique values
    int newArray[] = new int[j];
    for (int i = 0; i < j; i++) {
      newArray[i] = arr[i];
    }
    //step 4 get the value that you have the largest find 
    int k = 2;  // we have to find the 2nd largest element
    int k_largest = arr[newArray.length - k];

    System.out.println("k_largest: " + k_largest);

  }

}