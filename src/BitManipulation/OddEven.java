package BitManipulation;
import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       if((a&1)==1){
           System.out.println("Odd");
       }
       else{
           System.out.println("even");
       }
    }
}
