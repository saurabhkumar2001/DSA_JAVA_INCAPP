import java.util.*;

public class arrayInsertionAtSpecific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { 11, 22, 33, 44, 55 };
        System.out.println("enter the position:");
        int index = sc.nextInt();
        System.out.println("enter the value:");
        int value = sc.nextInt();
        int newarr[] = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        newarr[index] = value;
        for (int i = index; i < arr.length; i++) {
            newarr[i + 1] = arr[i];
        }
        arr = newarr;
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
