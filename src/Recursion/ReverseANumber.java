package Recursion;

public class ReverseANumber {

    static int sum=0;
    static void rev(int n){
        if(n==0){
            return ;
        }
        int rem=n%10;
       sum = sum*10 +rem;
        rev(n/10);
    }

    static void rev2(int n){
        int dig=(int)(Math.log10(n))+1;
        int a=helper(n,dig);
        System.out.println(a);
    }
    static int helper(int n,int base){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,base-1) + helper(n/10,base-1);
    }
    public static void main(String[] args) {

        rev(1234);
        System.out.println(sum);
        rev2(235);
    }
}
