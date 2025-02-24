package StacksQueues;
import java.util.*;
public class SumOfSubArrayMins {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,6,7,8,2};
        System.out.println(sumSubarrayMins(arr));
    }

        public static int sumSubarrayMins(int[] arr) {
            int n=arr.length;
            int x=0;
//            int mod = 1_000_000_007;
            int[] psi=pse(arr);
            int[] nsi= nse(arr);
            //just check ki each element kitni baari occur krega
            //ek find nse , pse;that done nsi-i;psi-i multiplly
            for(int i=0;i<n;i++){
                x+=(arr[i]*(i-psi[i])*(nsi[i]-i));
            }

            return x;
        }
        public static int[] nse(int[] arr){

            //ulta start krenge;
            int n=arr.length;
            int[] nsi=new int[n];
            Stack<Integer> st =new Stack<>();
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty()&& arr[st.peek()]>arr[i]){
                    st.pop();
                }
                nsi[i]=st.isEmpty()?n:st.peek();
                st.push(i);
            }
            return nsi;
        }
        public static int[] pse(int[] arr){


            int n=arr.length;
            int[] psi=new int[n];
            Stack<Integer> st =new Stack<>();
            for(int i=0;i<n;i++){
                while(!st.isEmpty()&& arr[st.peek()]<arr[i]){
                    st.pop();
                }
                psi[i]=st.isEmpty()?-1:st.peek();
                st.push(i);
            }
            return psi;
        }
    }

