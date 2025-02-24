package Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        print(10);
        System.out.println();
        pri(10);
    }
    static void print(int n){
        if(n==0){

            return;
        }
        System.out.println(n);
        print(n-1);

    }
    static void pri(int n){
        if(n==0){

            return;
        }
        pri(n-1);
        System.out.println(n);

    }
}
