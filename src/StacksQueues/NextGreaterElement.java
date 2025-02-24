package StacksQueues;
import java.util.*;


public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,7,6,0,4};
        int n=arr.length;
        int nge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(nge));

    }
}
