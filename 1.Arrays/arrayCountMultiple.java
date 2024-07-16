import java.util.*;
public class arrayCountMultiple {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //Creation...
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(" the values of the array is: ");
        for (int i : arr) {
            System.out.println(i);
        }
        // -----------------------
        System.out.println("enter the value u want to find multiple also find pos: ");
        int value = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (value==arr[i]) {
             count++;
             System.out.println(i);   
            }
        }
        System.out.println("Count of "+ value +" is: "+count);
    } 
}
