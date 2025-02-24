package Recursion;
import java.util.*;
public class Sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,78,80};
        int[] nums={1,2,3,6,5,7,8};
        System.out.println(sort(arr,0));
        System.out.println(sort(nums,0));
    }
    static boolean sort(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(arr,i+1);
    }
}
