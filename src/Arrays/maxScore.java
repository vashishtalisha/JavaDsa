package Arrays;
import java.util.*;
public class maxScore {
    public static void main(String[] args) {
        int[] arr={4,3,1,5,6};
        System.out.println(pairWithMaxSum(arr));
    }
    public static int pairWithMaxSum(int arr[]) {
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        int minsum=Integer.MIN_VALUE;
        //brute force
        for(int i=0;i<arr.length;i++){
             min=Integer.MAX_VALUE;
           smin=Integer.MAX_VALUE;

            for(int j=i;j<arr.length-1;j++){
                if(arr[j]<min){
                    smin=min;
                    min=arr[j];
                } if(arr[j]!=min&&arr[j]<smin){
                    smin=arr[j];
                }
                minsum=Math.max(minsum,min+smin);
            }
        }
        return minsum;
    }
}
