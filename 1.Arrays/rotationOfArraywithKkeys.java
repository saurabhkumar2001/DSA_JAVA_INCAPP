import java.util.Arrays;

public class rotationOfArraywithKkeys {
    public static void main(String args[]) {
        int[] arr = { 2, 7, 1, 5, 8, 4, 6, 9, 3 };
        int key = arr.length / 2;
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[(i + key) % arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }


// one more way 0ms effeciency

public void rotate(int arr[], int k) {
    k = k % arr.length;
    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, arr.length - 1);
}

public void reverse(int arr[], int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
}