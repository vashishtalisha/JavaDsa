package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={6,3,8,9,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void selection(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
