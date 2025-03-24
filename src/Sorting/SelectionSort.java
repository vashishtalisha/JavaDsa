package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void selection(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){

            int last=n-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
     static void swap(int[] arr, int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
