public class reversearray {
    public static void main(String args[]){
        int []arr = {2,3,4,5,6,7,8,9,78};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
            // 9 2 3 4 6 7 8 5 
        }
    }
}
