import java.util.ArrayList;

class Pair implements Comparable<Pair> {
	int v;
	int wt;
	public Pair(int v,int wt) {
		this.wt = wt;
		this.v = v;
	}
	
	public int compareTo(Pair p) {
		return this.wt-p.wt;
	}
}

class Graphhhh{
	private ArrayList<ArrayList<Pair>> edges;

	public Graphhhh(int v) {
		edges = new ArrayList<>();
		for (int i = 0; i < v; i++) {
			edges.add(new ArrayList<>());
		}
	}
	public void addEdge(int source, int destination, int w)
    {
		edges.get(source).add(new Pair(destination, w));
		edges.get(destination).add(new Pair(source, w));
    }
	
	//Prim's Minimum Spanning Tree Algo
	public void primsMST(int v) {
		boolean visited[] = new boolean[v];
		java.util.PriorityQueue<Pair> pq = new java.util.PriorityQueue();
		pq.add(new Pair(0,0));
		int MST=0;
		while(pq.size()!=0) {
			Pair current=pq.remove();
			int u=current.v;
			if(visited[u]){ continue; }
			MST += current.wt;
			System.out.print(u+"\t");
			visited[u]=true;	
			ArrayList<Pair> neighbors=edges.get(u);
			for(Pair p:neighbors) {
				int vertex=p.v;
				int weight=p.wt;
				if(visited[vertex]==false) {
					pq.add(new Pair(vertex,weight));
				}
			}
		}
		System.out.println("\nMST value: "+MST);
	}
}



public class DSA_Prims {
	public static void main(String[] args) {
		//Create the Graph using keyboard
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of vertices and edges");
//		int v = sc.nextInt();
//		int e = sc.nextInt();
//
//		Graphhhh graph = new Graphhhh(v);
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
        Graphhhh graph = new Graphhhh(v);
 
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 3, 5);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 3);
        graph.addEdge(1, 5, 3);
        graph.addEdge(2, 3, 2);
        graph.addEdge(2, 4, 8);
        graph.addEdge(3, 4, 1);
        graph.addEdge(4, 5, 4);
 
        graph.primsMST(v);
		
	}
}