import java.util.*;
public class arrayDeletionatbeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { 11, 22, 33, 44, 55 };
        //deletion at the beg ...
        int newarr[] = new int[arr.length - 1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i]=arr[i+1];
        }
        arr = newarr;
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
