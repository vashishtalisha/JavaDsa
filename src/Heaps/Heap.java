package Heaps;
import java.util.*;
public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;
    public Heap(){
        list=new ArrayList<>();
    }
    private void swap(int f,int s){
        T temp=list.get(f);
        list.set(f,list.get(s));
        list.set(s,temp);
    }
    private int parent(int i){
        return(i-1)/2;
        //why i-1 coz actual mein 0-indexed;
    }
    private int left(int i){
        return i*2+1;
    }
    private int right(int i){
        return i*2+2;
    }
    public void insert(T val){
        list.add(val);
        upheap(list.size()-1);


    }
    private void upheap(int i){
        if(i==0){
            return;
        }
        int p=parent(i);
        if(list.get(p).compareTo(list.get(i))>0){
            swap(i,p);
            upheap(p);
        }

    }
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("nooo");
        }
        T temp=list.get(0);
        T last=list.remove(list.size()-1);
       if(!list.isEmpty()){
           list.set(0,last);
           downheap(0);
       }
        return temp;
    }
    private void downheap(int i){
        int min=i;
        int l=left(i);
        int r=right(i);
        if(l<list.size()&&list.get(min).compareTo(list.get(l))>0){
            min=l;
        }
        if(r<list.size()&&list.get(min).compareTo(list.get(r))>0){
            min=r;
        }

        if(min!=i){
            swap(min,i);
            downheap(min);
        }
    }
    public ArrayList<T> heapsort() throws Exception{
        ArrayList<T> data=new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
