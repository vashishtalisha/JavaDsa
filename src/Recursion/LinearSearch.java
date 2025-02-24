package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,78,80};
        System.out.println(linear(arr,0,6));
    }
    static int linear(int[] arr,int i,int key){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return linear(arr,i+1,key);
    }
}
