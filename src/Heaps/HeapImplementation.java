package Heaps;

import java.sql.SQLOutput;

public class HeapImplementation {

    public static void main(String[] args) throws Exception {
        Heap<Integer> h=new Heap<>();
        h.insert(34);
        h.insert(45);
        h.insert(22);
        h.insert(89);
        h.insert(76);
        System.out.println(h.remove());
        System.out.println(h.remove());
        System.out.println(h.remove());
    }
}
