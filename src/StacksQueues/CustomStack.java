package StacksQueues;

public class CustomStack {
    //not a dynamic stack ; will throw an exception when array/stack is full
   protected int[] data;
   private static final int DEFAULT_SIZE=10;
    int ptr=-1;
   public CustomStack(){
       this(DEFAULT_SIZE);
       //calling another constructor using this.
   }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    //insertion;its pretty simple . we just need to maintain a pointer.Initially when its empty . ptr=-1. after each insertion increase the pointer value by 1 . on removal decrease the pointer value by 1.
    //This ponter will always point to the last vale thats added

    public boolean push(int item){
       //if the array is already full;then no insertion ; return false
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
       ptr++;
       data[ptr]=item;
       return true;
    }
    public int pop() throws Exception{
       if(isEmpty()){
           throw new Exception("cant pop from an empty stack");
       }
//       int removed=data[ptr];
//       ptr--;
//       return removed;
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("cant peek from an empty stack");
        }
       return data[ptr];
    }
    public boolean isFull(){
       return ptr==data.length-1;
    }
    public boolean isEmpty(){
       return ptr==-1;
    }


}
