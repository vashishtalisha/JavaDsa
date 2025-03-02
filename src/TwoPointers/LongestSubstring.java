package TwoPointers;
import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        int l=0;int r=1;
        int n=s.length();
        int res=1;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        while(r<n){
            int len=0;
            for(int i=l;i<r;i++) {
                if(s.charAt(r)==s.charAt(i)){
                    l=i+1;
                    break;
                }
            }
            len=r-l+1;
            res=Math.max(len,res);
            r++;
        }
        return res;
    }
}
