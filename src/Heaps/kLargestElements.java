package Heaps;
import java.util.*;
public class kLargestElements {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int[] arr={7,6,9,23,1,5,0};
        int k=3;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
