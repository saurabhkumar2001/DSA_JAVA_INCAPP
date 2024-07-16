public class subarrays {
    public static int subArrays(int arr[]){
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k= i; k <=j; k++) {
                    System.out.print(arr[k]);
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        return ts;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int ts=subArrays(arr);
        System.out.println("total subarray in the array is"+ ts);
    }
}
