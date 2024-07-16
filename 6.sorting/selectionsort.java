import java.util.Arrays;

public class selectionsort {
public static void main(String[] args) {
    int arr[] = new int[]{2,7,4,8,33,6,90};
    for (int i = 0; i < arr.length-1; i++) {
        int minpos = i;
        for (int j = i; j < arr.length; j++) {  //isme last wale element ko bhi consider krenge jth loop m 
            if(arr[minpos]>arr[j]){
                minpos = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[minpos];
        arr[minpos] = temp;
    }

    System.out.println(Arrays.toString(arr));

}
    
}