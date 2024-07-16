import java.util.*;
public class arraySequence{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int[] arr = {3,0,1,4};
        //actual sum 
       int actualsum=0;
        for(int i :arr){
            actualsum+=i;
        }
        //8
        int min = arr[0];
        for(int x:arr){
            if(min>x){
                min=x;
            }
        }
        //min = 0
        int expectedsum=min;
        for(int x =1;x<=arr.length;x++){
            expectedsum = expectedsum+(min+x);
            //0+(0+1)=1,1+(0+2)=3,3+(0+3)=6,6+(0+4)=10;     10-8=2 missing value
            //min+x and x is the jump
            //0+1=1,1+1=2,2+1=3.............;
        }
        int missingValue = expectedsum - actualsum;
        System.out.println("missingValue: "+missingValue);
    }


}