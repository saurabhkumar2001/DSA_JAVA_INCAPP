import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Edge implements Comparable<Edge> {
    int src, dest, wt;
    
    public Edge(int src, int dest, int wt) {
		this.src = src;
		this.dest = dest;
		this.wt = wt;
	}

	public int compareTo(Edge compareEdge) {
        return this.wt - compareEdge.wt;
    }
}

class Graphhhhhhhhh{
	private ArrayList<Edge> edges;

	public Graphhhhhhhhh() {
		edges = new ArrayList<Edge>();
	}
	public void addEdge(int source, int destination, int w)
    {
		edges.add(new Edge(source,destination, w));
    }
	
	
	//Kruskal's Algo
	int find(int parent[], int i) {
        if (parent[i] == i) 
        	return i;
        else 
        	return find(parent, parent[i]);
    }
	void union(int parent[], int a, int b) {
       if(a!=b) {
        	parent[b] = a;
       }
    }
	public void KruskalMST(int v) {
		int parent[]=new int[v];
		for(int i=0;i<v;i++) { parent[i]=i;  }
		Collections.sort(edges);
		int MST=0;
		for(Edge edge:edges) {
			int rootX=find(parent,edge.src);
			int rootY=find(parent,edge.dest);
			if(rootX != rootY) {
		    	   	System.out.print(edge.src+","+edge.dest+":"+edge.wt+"\t");
				union(parent, rootX, rootY);
				MST += edge.wt;
			}
		}
		System.out.println("\nMST value: "+MST);
	}
}



public class DSA_Kruskal {
	public static void main(String[] args) {
		//Create the Graph using keyboard
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of vertices and edges");
//		int v = sc.nextInt();
//		int e = sc.nextInt();
//
//		Graphhhhhhhhh graph = new Graphhhhhhhhh(v);
//		System.out.println("Enter the edges with weight");
//		for (int i = 0; i < e; i++) {
//			int source = sc.nextInt();
//			int destination = sc.nextInt();
//			int weight = sc.nextInt();
//
//			graph.addEdge(source, destination,weight);
//		}
//		sc.close();

		//Create the Graph without keyboard
        int v = 6;
        Graphhhhhhhhh graph = new Graphhhhhhhhh();
 
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 3, 5);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 3);
        graph.addEdge(1, 5, 3);
        graph.addEdge(2, 3, 2);
        graph.addEdge(2, 4, 8);
        graph.addEdge(3, 4, 1);
        graph.addEdge(4, 5, 3);
        
		
        graph.KruskalMST(v);
		
	}
}
