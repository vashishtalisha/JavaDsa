package Heaps;
import java.util.*;
public class Ksorted {
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,10,9};
        //the array is nearly sorted in the range of k ;
        //mtln ek element ki right position khali k range tak check karungi ;'
        //eg. 6,5,3,2 mein minimum is 2 . put it at arr[0]
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int j=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                arr[j]=pq.poll();
                j++;
            }

        }
        while(!pq.isEmpty()){
            arr[j]=pq.poll();
            j++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
