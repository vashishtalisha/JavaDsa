package StacksQueues;

class MyQueue {

    int front, rear;
    int arr[] = new int[100005];
    int s;

    MyQueue()
    {
        front=-1;
        rear=-1;
        s=0;

    }

    //Function to push an element x in a queue.
    void push(int x)
    {
        //front == -1
        if(s==0){
            front++;
            rear++;
        }
        //(rear + 1) % arr.length == front...full
        else if(s==arr.length){
            return;
        }
        else{
            rear=(rear+1)%arr.length;
        }
        s++;
        arr[rear]=x;

    }

    //Function to pop an element from queue and return that element.
    int pop()
    {

        if(s==0){
            return -1;
        }
        int x=arr[front];
        //front == rear
        if(s==1){

            front=rear=-1;

        }
        else{
            front=(front+1)%arr.length;}
        s--;
        return x;

    }
}