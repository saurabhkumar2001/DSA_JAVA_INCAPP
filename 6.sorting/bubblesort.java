import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = new int[] { 67, 324, 7, 48, 22, 90, 22, 66, 33, 7 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.print(Arrays.toString(arr));
    }

}
