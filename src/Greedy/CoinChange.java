package Greedy;

public class CoinChange {
    /*Given an array coins[] represent the coins of different denominations and a target value sum.
     You have an infinite supply of each of the valued coins{coins1, coins2, ..., coinsm}.
      Find the minimum number of coins to make the change. If not possible to make a change then
      return -1.

     */
    public static void main(String[] args) {
      int[] c={50,60};
        System.out.println(coins(c,19));
    }
    static int coins(int[] c,int val){
        //pehle binary search se find the value just less than the target . agar equal mil jaye
        //tab to return 1;
        //else kam vali values se kaam karo
        int csum=1;
        if(val==0){
            return 0;

        }
        int k=Floor(c,val);
        if(k==-1){
            return -1;
        }
        if(c[k]==val){
            return 1;
        }
        int valsum=c[k];

        while(valsum<=val && k>=0){
           if(valsum+c[k]<=val){
               valsum+=c[k];
               csum++;
           }else {

                   k--;

           }
        }
        if(valsum==val){
            return csum;
        }
        return -1;

    }
    static int Floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
