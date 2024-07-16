import java.util.*;
public class arrayCreationTraversing{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //Creation...
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //Traversing...
        System.out.println("the values of the array: ");
        for(int x:arr){
            System.out.println(x);
        }
    }  
}