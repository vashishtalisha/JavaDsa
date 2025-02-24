package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(zero(102030));
        int count=0;

        System.out.println( zero2(10203040,count));
    }
    static int count=0;
    static int zero(int n){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        return zero(n/10);
    }
    static int zero2(int n,int count){
        if(n==0){
            return count ;
        }
        if(n%10==0){
            return zero2(n/10,count+1);
        }
        return zero2(n/10,count);

    }

}
