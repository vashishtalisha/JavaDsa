package StacksQueues;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

        Queue<Integer> q;
        int size;

        public StackUsingQueue() {
            size=0;
            q=new LinkedList<>();
        }

        public void push(int x) {
            q.add(x);
            size++;
            for(int i=0;i<size-1;i++){
                q.add(q.peek());
                q.remove();
            }

        }

        public int pop() {
            if (q.isEmpty()) return -1;
            size--;
            return q.remove();
        }

        public int top() {
            return  q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }

}
