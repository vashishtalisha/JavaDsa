package Graphs;

import java.sql.SQLOutput;
import java.util.*;

public class BFS {
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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));
    }
    public static void bfs( ArrayList<Edge> graph[],boolean visited[],int start){
        Queue<Integer> q=new LinkedList<>();


        q.add(start);
        while(!q.isEmpty()){
            int  curr=q.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[],boolean visited[],int curr){
        System.out.println(curr);
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false){
                dfs(graph,visited,e.dest);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[7];
        neighbours(graph);
        int V=graph.length;
//        boolean visited[]=new boolean[V];
//        for(int i=0;i<V;i++){
//            if(visited[i]==false){
//                bfs(graph,visited,i);
//            }
//        }
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                dfs(graph,visited,i);
            }
        }


    }
}
