package Graphs;

import java.util.ArrayList;
public class AllPaths {
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
    public static void paths(ArrayList<Edge> graph[],int curr,int target,String path,boolean visited[]){
        if(curr==target){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                visited[curr]=true;
                paths(graph,e.dest,target,path+e.dest,visited);
                visited[curr]=false;
            }

        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[7];
        neighbours(graph);
        int V=graph.length;
        boolean visited[]=new boolean[V];

                paths(graph,0,5,"0",visited);



    }
}
