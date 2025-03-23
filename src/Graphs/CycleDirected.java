package Graphs;

import java.util.ArrayList;

public class CycleDirected {
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
        //graph[3].add(new Edge(3,0));


    }
    public static boolean cycle(ArrayList<Edge> graph[],int curr,boolean vis[],boolean[] rec){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
            if(!vis[e.dest]){
                return cycle(graph,e.dest,vis,rec);
            }
        }
        rec[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[4];
        neighbours(graph);
        boolean vis[]=new boolean[4];
        boolean rec[]=new boolean[4];
        for(int i=0;i<4;i++){
            if(!vis[i]){
                boolean a=cycle(graph,i,vis,rec);
                System.out.println(a);


            }
        }

    }
}
