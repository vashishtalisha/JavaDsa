package BitManipulation;
import java.util.*;
public class ithBit {
    public static void main(String[] args) {
        int x=34;
        int n=3;
        //get
        System.out.println((x>>(n-1))&1);
        //set to 1
        //mask should be or with 0001000
        System.out.println(x|(1<<(n-1)));
        //reset to 0
        int mask=1<<(n-1);
        System.out.println(x&(~mask));

    }


}
