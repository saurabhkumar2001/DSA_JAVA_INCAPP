import java.util.*;
public class linearsearchArr{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int arr[] = new int[]{11,22,33,44,55};
        System.out.println("Enter the value to find in the array: ");
        int value = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(value == arr[i]){
                System.out.println("value is found at the index "+ i);
                flag = false;
                break;
            }
        } 
        if(flag){
            System.out.println("value is not found");
        }
    } 

}