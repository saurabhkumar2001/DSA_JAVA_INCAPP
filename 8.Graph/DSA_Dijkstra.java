import java.util.ArrayList;
import java.util.Arrays;

class Pairrrr implements Comparable<Pairrrr> {
	int v;
	int wt;
	public Pairrrr(int v,int wt) {
		this.wt = wt;
		this.v = v;
	}
	@Override
	public int compareTo(Pairrrr p) {
		return this.wt-p.wt;
	}
}

class Graphhhhhhh{
	private ArrayList<ArrayList<Pairrrr>> edges;

	public Graphhhhhhh(int v) {
		edges = new ArrayList<>();
		for (int i = 0; i < v; i++) {
			edges.add(new ArrayList<>());
		}
	}
	public void addEdge(int source, int destination, int w)
    {
		edges.get(source).add(new Pairrrr(destination, w));
		edges.get(destination).add(new Pairrrr(source, w));
    }
	
	//Dijkstra's Algo
	public void dijkstra(int v) {
		boolean visited[] = new boolean[v];
		java.util.PriorityQueue<Pair> pq = new java.util.PriorityQueue();
		pq.add(new Pair(0,0));
		int path[]=new int[v];
		Arrays.fill(path, 1000000000);
		path[0]=0;
		while(pq.size()!=0) {
			Pair current=pq.remove();
			int u=current.v;
			if(visited[u])
			{
				continue;
			}
			visited[u]=true;
			ArrayList<Pairrrr> neighbors=edges.get(u);
			for(Pairrrr p:neighbors) {
				int vertex=p.v;
				int weight=p.wt;
				if(path[u]+weight<path[vertex]) {
					path[vertex]=path[u]+weight;
					pq.add(new Pair(vertex,weight));
				}
			}
		}
		for(int x=0;x<path.length;x++) {
			System.out.println("Shortest Path from Source "+0+" to "+x+" : "+path[x]);
		}
		
	}
	
	public void shortestPath(int s,int d) {
		//your logic
	}
}



public class DSA_Dijkstra {
	public static void main(String[] args) {
		//Create the Graph using keyboard
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of vertices and edges");
//		int v = sc.nextInt();
//		int e = sc.nextInt();
//
//		Graphhhhhhh graph = new Graphhhhhhh(v);
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
//        int v = 9;
//        Graphhhhhhh graph = new Graphhhhhhh(v);
 
//        graph.addEdge(0, 1, 4); //s  d  w
//        graph.addEdge(0, 7, 8);
//        graph.addEdge(1, 2, 8);
//        graph.addEdge(1, 7, 11);
//        graph.addEdge(2, 3, 7);
//        graph.addEdge(2, 8, 2);
//        graph.addEdge(2, 5, 4);
//        graph.addEdge(3, 4, 9);
//        graph.addEdge(3, 5, 14);
//        graph.addEdge(4, 5, 10);
//        graph.addEdge(5, 6, 2);
//        graph.addEdge(6, 7, 1);
//        graph.addEdge(6, 8, 6);
//        graph.addEdge(7, 8, 7);
        
		int v = 6;
        Graphhhhhhh graph = new Graphhhhhhh(v);
 
        graph.addEdge(0, 2, 4);
        graph.addEdge(0, 3, 2);
        graph.addEdge(1, 2, 9);
        graph.addEdge(1, 4, 1);
        graph.addEdge(2, 3, 3);
        graph.addEdge(2, 5, 1);
        graph.addEdge(3, 5, 1);
        graph.addEdge(4, 5, 2);
 
        graph.dijkstra(v);
        graph.shortestPath(0, 4); //0-2-4
		
	}
}