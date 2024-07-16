public class mergesort {

    public static void divide(int arr,int lower,int upper){
        if(lower!=upper){
            int mid=(lower+upper)/2;
            divide(arr, lower, mid);
            divide(arr, mid+1,upper);
            conquer(arr,lower,upper,mid);
        }
    }

    public static void conquer(int arr[],int lower,int upper,int mid){
        int merged[] = new int[upper-lower+1];
        int i1 = lower;
        int i2 = mid+1;
        int x =0;
        while (i1<=mid && i2<=upper) {
           if(arr[i1]<=arr[i2]){
                merged[x++] = arr[i1];
           }else{
            merged[x++] = arr[i2];
           }
        }
        while (i1<=mid) {
            merged[x++] = arr[i1++];
        }
        while (i2<=upper) {
            merged[x++] = arr[i2++];
        }

        for (int i = 0,j=lower; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
    int arr[] = new int[]{2,7,4,8,33,6,90};
    int len = arr.length; 
    divide(arr,0,len-1);
    for (int x : arr) {
        System.out.print(x + " ");
    }
        
}
}