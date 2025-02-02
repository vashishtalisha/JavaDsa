package StacksQueues;
import java.util.*;

public class InBuiltEg {
    public static void main(String[] args) {
        //generic
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //pop returns an integer
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println();
        //removing from empty stack gives exception
       // System.out.println(st.pop());

        Queue<Integer> b=new LinkedList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);

        System.out.println(b.remove());
        System.out.println(b.remove());
        System.out.println(b.remove());
        System.out.println(b.remove());
        System.out.println(b.remove());

    }
}
