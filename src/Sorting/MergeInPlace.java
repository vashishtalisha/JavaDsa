package Sorting;
import java.util.*;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr={9,8,54,3,2,1,0,6,-8};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static  void mergeSort(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int m=(s+e)/2;
        mergeSort(arr,s,m);
        mergeSort(arr,m,e);

        merge(arr,s,m,e);

    }
    public static void merge(int[] arr, int s, int m , int e){
        int[] mix=new int[e-s];
        int i=s,j=m,k=0;
        while(i<m&&j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                k++;
                i++;
            }else{
                mix[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<m){
            mix[k]=arr[i];
            k++;
            i++;
        }while(j<e){
            mix[k]=arr[j];
            k++;
            j++;
        }

        for(int h=0;h< mix.length;h++){
            arr[s+h]=mix[h];
        }
    }
}
