import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        boolean flag = true;
        int arr[] = { 12, 45, 6, 78, 56, 4, 3, 45, 50, 55, 6, 89, 90 };
        Arrays.sort(arr);
        int value = 45;
        int lower = 0;
        int upper = arr.length - 1;
        if (lower <= upper) {
            int mid = (upper + lower) / 2;
            if (arr[mid] < value) {
                lower = mid + 1;
            } else if (arr[mid] > value) {
                upper = mid - 1;
            } else {
                System.out.println("value found! ");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("value not found");
        }

    }

}
