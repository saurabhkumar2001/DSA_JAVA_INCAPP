import java.util.LinkedList;
class graphh{
   private LinkedList<Integer> edges[];
   graphh(int v){
    edges = new LinkedList[v];
    for (int i = 0; i < edges.length; i++) {
    edges[i] = new LinkedList<Integer>();     
    }
   }

   public void addEdge(int source, int destination){
    edges[source].add(destination);
    edges[destination].add(source);
   }

   public void  traverse(){
    int v = 0;
    for (LinkedList<Integer> x : edges) {
        System.out.print(v+": ");
        v++;
       for (int y : x) {
        System.out.print(y+" ");
       }
       System.out.println();
    }
   }

   public void countEdge(){
    int t = 0;
    for (LinkedList<Integer> x : edges) {
        t = t+x.size();
    }
    System.out.println("total edges are:"+t/2);
   }

   public void printEdge(int v) {
    if (v < 0 || v >= edges.length) {
        System.out.println("Vertex " + v + " is out of bounds");
        return;
    }
    System.out.print("Edges connected to vertex " + v + ": ");
    for (int edge : edges[v]) {
        System.out.print(edge + " ");
    }
    System.out.println();
}
}

    

public class graphcreation {
public static void main(String[] args) {
    int v = 9;
        graphh  graph = new graphh(v);
 
        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(1, 2);
        graph.addEdge(1, 7);
        graph.addEdge(2, 3);
        graph.addEdge(2, 8);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(6, 8);
        graph.addEdge(7, 8);


        graph.traverse();
        graph.countEdge();
        graph.printEdge(2);
}
}