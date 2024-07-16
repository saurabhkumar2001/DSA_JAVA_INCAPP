import java.util.*;

public class arrayInsertionbeg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Creation...
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the values of the array: ");
        for (int x : arr) {
            System.out.println(x);
        }
        //insertion at the beg...
        System.out.println("Enter the values you want to enter into the beg of the array: ");
        int value = sc.nextInt();
        int newarr[] = new int[arr.length+1];
        newarr[0]=value;
        for (int i=0; i<arr.length;i++) {
            newarr[i+1]=arr[i];
        }
        arr = newarr;
        System.out.println("values are after inserting at beg: ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
