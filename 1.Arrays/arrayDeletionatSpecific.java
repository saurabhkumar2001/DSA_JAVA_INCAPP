import java.util.*;
public class arrayDeletionatSpecific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { 11, 22, 33, 44, 55 };
        System.out.println("enter the position you want to delete the value :");
        int index = sc.nextInt();
        int newarr[] = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newarr[i]=arr[i];
        }
        for (int i = index; i < newarr.length; i++) {
            newarr[i]=arr[i+1];
        }
        arr = newarr;
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
