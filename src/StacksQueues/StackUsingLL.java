//package StacksQueues;
//
//public class StackUsingLL {
//    StackNode top;
//    int count=0;
//    // Function to push an integer into the stack.
//
//    void push(int a) {
//        StackNode node=new StackNode(a);
//
//        node.next=top;
//        top=node;
//        count++;
//    }
//
//    // Function to remove an item from top of the stack.
//    int pop() {
//        if(count==0){
//            return -1;
//        }
//        StackNode temp=top;
//        top=top.next;
//        return temp.data;
//    }
//}
