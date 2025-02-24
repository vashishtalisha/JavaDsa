package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sod(123));
        System.out.println(prod(234));
    }
    static int sod(int n){
        if(n==0){
            return 0;
        }
        return n%10+sod(n/10);
    }
    static int prod(int n){

        if(n==0){
            return 1;
        }
        return n%10*prod(n/10);
    }

}
