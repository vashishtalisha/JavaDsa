package BinaryTrees;
import java.util.*;

public class BinaryTree {
    public BinaryTree(){

    }
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int val){
            this.value=val;
        }

    }
    Node root;
    public  void populate(Scanner sc){
        System.out.println("Enter root node:");
        int val=sc.nextInt();
        root=new Node(val);
        populate(sc,root);
    }
    public void populate(Scanner sc,Node node){
        System.out.println("wanna enter to left?");
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter value to the left:");
            int val=sc.nextInt();
         node.left=new Node(val);
         populate(sc,node.left);

        }
        System.out.println("wanna enter to right?");
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter value to the right:");
            int val=sc.nextInt();
            node.right=new Node(val);
            populate(sc,node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    public void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
}
