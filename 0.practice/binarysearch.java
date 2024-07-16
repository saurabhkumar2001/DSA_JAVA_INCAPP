public class binarysearch {
    public static int binarysearch(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } 
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 34, 45, 50, 65, 66, 78, 79, 90 };
        int key = 70;
        if (binarysearch(arr, key)!=-1) {
            System.out.println("the number found at the index: " + binarysearch(arr, key));
        }else{
            System.out.println("element not found ");
        }
    }
}
