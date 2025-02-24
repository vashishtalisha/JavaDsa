package BinaryTrees;
import java.util.*;

//public class PopulatingNextRightPointers {
//
//        public Node connect(Node root) {
//
//            if(root==null){
//                return root;
//            }
//            Queue<Node> q=new LinkedList<>();
//            q.offer(root);
//
//            while(!q.isEmpty()){
//                int levelsize=q.size();
//                Node curr=root;
//                for(int i=0;i<levelsize;i++){
//                    curr=q.poll();
//                    curr.next=q.peek();
//
//                    if(curr.left!=null){
//                        q.offer(curr.left);
//                    }
//                    if(curr.right!=null){
//                        q.offer(curr.right);
//                    }
//
//                }
//                curr.next=null;
//            }
//
//            return root;
//        }
//    }
//
