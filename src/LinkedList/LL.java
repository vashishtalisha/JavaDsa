import java.util.*;
//basic node structure
//display
//insert,first,last
//delete,first,last
public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size=0;
    }
    //to insert item at the beginning
    //first you create the element/box;
    //where val=14;next=nul;
    //but next should point to head;
    //head=node;


    //now if the list was empty;
    //again create a new item;
    //here, val=14;next= null;
    //head=tail=node;
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
        }
        if(index==size){
            insertLast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val, temp.next);
        temp.next=node;
        size++;
    }
    //insert using recursion
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp= new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index--,node.next);
        return node;
    }
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail=secondLast;
        tail.next =null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node previous=get(index-1);
        int val=previous.next.value;
        previous.next=previous.next.next;
        size--;
        return val;

    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    //find node that has this value
    public Node find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    //remove dupes
    public void remDup(){
        Node temp=head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;

            }
            else{
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;

        }
    }
}
