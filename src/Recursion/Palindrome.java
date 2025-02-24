package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(12212));
    }
    static boolean palindrome(int n){
        return (rev(n)==n);
    }
    static int rev(int n){
        int dig=(int)(Math.log10(n))+1;
        return helper(n,dig);
    }
    static int helper(int n,int base){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,base-1) + helper(n/10,base-1);
    }
}
