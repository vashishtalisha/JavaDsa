package BinaryTrees;
import java.sql.SQLOutput;
import java.util.*;
public class BST {
    public class Node{
        Node left;
        Node right;
        int height;
        int value;
        public Node(int val){
            value=val;
        }
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    Node root;
    public BST(){

    }
    public void populate(int[] arr){
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
    }
    public void populatesorted(int[] arr){
        populatesorted(arr,0,arr.length);
    }
    public void populatesorted(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        insert(arr[mid]);
        populatesorted(arr,start,mid);
        populatesorted(arr,mid+1,end);
    }

    //insertion
    public void insert(int val){
        root=insert(val,root);
    }
    public Node insert(int val,Node node){
        if(node==null){
            return new Node(val);
        }
        if(val<node.value){
            node.left=insert(val,node.left);
        }
        if(val>node.value){
            node.right=insert(val,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1 ;
        return node;
    }
    //check if balanced
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left)&& balanced(node.right);
    }
    //display
    public void display(){
      display(root,"root node:");
    }
    public void display(Node node,String deets){
        if(node==null){
            return;
        }
        System.out.println(deets+node.value);
        display(node.left,"node to left of"+node.value+" ");
        display(node.right,"node to right of"+node.value+" ");

    }
}
