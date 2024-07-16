import java.util.Arrays;

public class countingsort {
public static void main(String[] args) {
    int arr[] = new int[]{5,6,1,3,6,2,4,5};
    int val = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(val<arr[i]){
            val = arr[i];
        }
    }
  int count[] = new int[val+1];

  for (int i = 0; i <arr.length; i++) {
    count[arr[i]]++;
  }

  for (int i = 1; i < count.length; i++) {
    count[i] = count[i]+count[i-1];
  }

  int output[] = new int[arr.length];
  for (int i = 0; i < output.length; i++) {
    output[count[arr[i]]-1] = arr[i];
    count[arr[i]]--;    
}
arr = output;
output = null;

System.out.println(Arrays.toString(arr));


}    
}
