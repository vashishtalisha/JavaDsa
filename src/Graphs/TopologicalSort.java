package Graphs;

import java.util.*;

public class TopologicalSort {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            src=s;
            dest=d;


        }
    }
    public static void neighbours( ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
//        graph[3].add(new Edge(3,0));
//        graph[2].add(new Edge(2,3));

    }
    public static void topo(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> st){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){

                topo(graph,e.dest,vis,st);
            }
        }
        st.push(curr);
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[4];
        neighbours(graph);
        boolean vis[]=new boolean[4];
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i < 4; i++) {
            if (!vis[i]) {
                topo(graph, i, vis, st);
            }
        }

        // Print the sorted order
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }


    }
}
