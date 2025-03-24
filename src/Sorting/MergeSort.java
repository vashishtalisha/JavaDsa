package Sorting;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={8,5,12,9,6,2,3};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int n=left.length;
        int m=right.length;
        int res[]= new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(left[i]<=right[j]){
                res[k]=left[i];
                k++;
                i++;
            }else{
                res[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n){
            res[k]=left[i];
            k++;
            i++;
        }
        while(j<m){
            res[k]=right[j];
            k++;
            j++;
        }
        return res;
    }
}
