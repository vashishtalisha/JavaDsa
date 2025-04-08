package Arrays;

public class MaximumConsecutiveOnes {
    public static int longestOnes(int[] arr, int k) {
        int count=0,r=0,l=0,len=0,n=arr.length;
        while(r<n){
            if(arr[r]==0)count++;

            while(count>k){
                if(arr[l]==0)count--;
                l++;
            }

            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr,2));
    }
}
