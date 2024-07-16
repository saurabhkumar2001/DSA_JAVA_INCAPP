import java.util.Arrays;

public class rotationOfArray {
    public static void main(String[] args) {
		
		int[] arr = { 2,7,1,5,8,4,6,9,3 };
		System.out.println(Arrays.toString(arr));
		
		//rotate the array
		


		//step 1 reverse the array
		for(int x=0;x<arr.length/2;x++) {
			int temp = arr[x]; 
			arr[x] = arr[arr.length-1-x]; 
			arr[arr.length-1-x] = temp; 
		}

		//step 2 half the range do the same
		int half=arr.length/2;
		for(int x=0;x<half/2;x++) {
			int temp = arr[x]; 
			arr[x] = arr[half-1-x]; 
			arr[half-1-x] = temp; 
			
		}
		
		for(int x=half,j=0;x<(half+arr.length)/2;x++,j++) {
			int temp = arr[x]; 
			arr[x] = arr[arr.length-1-j]; 
			arr[arr.length-1-j] = temp; 
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
