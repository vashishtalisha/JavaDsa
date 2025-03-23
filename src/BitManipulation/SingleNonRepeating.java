package BitManipulation;
import java.util.*;
public class SingleNonRepeating {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4,5,6,6,5,3};
        int res=0;
        for(int i=0;i<arr.length;i++){
            res^=arr[i];
        }
        System.out.println(res);
    }
}
