package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(5));
        System.out.println(sum(5));
    }
    static int fac(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
