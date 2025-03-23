package ClassQues;

public class MaximunProduct {
    public static int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int a=nums[i];
            int b=a*min;
            int c=a*max;
            min=Math.min(a,Math.min(b,c));
            max=Math.max(a,Math.max(b,c));
            res=Math.max(res,max);
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[]={2,3,-2,4,5};
        System.out.println(maxProduct(arr));
    }
}
