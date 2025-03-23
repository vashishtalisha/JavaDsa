package Graphs;
import java.util.*;
public class Graph1 {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            src=s;
            dest=d;
            wt=w;

        }
    }
    public static void neighbours( ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,2,6));
        graph[1].add(new Edge(1,3,10));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,5));graph[2].add(new Edge(2,3,2));
        graph[3].add(new Edge(3,1,19));
        graph[3].add(new Edge(3,2,2));
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[4];
        neighbours(graph);
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest+" , "+e.wt);
        }
    }
}
