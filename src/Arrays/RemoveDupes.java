package Arrays;

import java.util.*;

public class RemoveDupes {
    public static void main(String[] args) {
        int[] array={1,1,2,2,3,4};
        System.out.println(removeDuplicates(array));
    }
    public static int removeDuplicates(int[] nums) {
        int n= nums.length;
        int k=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }

        }
        return k;

    }
//    public static int dupe(int[] arr){
//        int n= arr.length;
//        HashSet<Integer> hs=new HashSet<>();
//        int k=0;
//        for(int i=0;i<n;i++){
//            if(!hs.contains(arr[i])){
//
//            }
//        }
//    }
}
