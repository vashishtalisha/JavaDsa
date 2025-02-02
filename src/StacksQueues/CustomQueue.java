package StacksQueues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
        //calling another constructor using this.
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    private boolean isFull(){
        return end==data.length;
    }
    private boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("cant pop from an empty stack");
        }
        int removed=data[0];
        //shift elements to left
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
 //display function
}
