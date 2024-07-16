import java.util.Arrays;
import java.util.*;
public class mergearray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4 };
        int arr1[] = { 6, 7, 8 };
        int arr3[] = new int[arr.length + arr1.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            arr3[j++] = arr[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }

        Arrays.sort(arr3);

        for (int i : arr3) {
            System.out.print(i+" ");
        }
    }
}
