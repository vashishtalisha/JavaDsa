package BitManipulation;
import java.util.*;
public class DecimalToB {
    public static void main(String[] args) {
        System.out.println(convert(34,2));
    }
    public static int convert(int num,int b){
        int rem;
        int res=0;
        int p=0;
        while(num>0){
            rem=num%b;
            res+=rem*Math.pow(10,p);
            p++;
            num/=b;



        }
        return res;
    }
}
