package Sorting;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={4,2,1,7};
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(tswap(arr));
    }
    //bubble sort
    static void bubble(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }


            }
        }
    }
    //to count total number of swaps
    static  int tswap(int[] arr){
        int count =0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                    swapped=false;
                }



            }
            if(!swapped){
                break;
            }

        }
        return count;
    }
    //number of swaps in each iteration

}
