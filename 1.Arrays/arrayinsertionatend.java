import java.util.*;

public class arrayinsertionatend {
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
        // insertion at the end...
        int newarr[]=new int[arr.length+1];
        System.out.println("Enter the value you want to enter at last: ");
        int value = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        newarr[newarr.length-1]=value;
        arr= newarr;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
