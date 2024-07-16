
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Graph {

	private LinkedList<Integer> edges[];

	public Graph(int v) {
		edges = new LinkedList[v];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int source, int destination) {
		edges[source].add(destination);
		edges[destination].add(source);
	}

	public void bfsTraversal(int source) {

		boolean visted[] = new boolean[edges.length];
		Queue<Integer> q = new LinkedList<>();

		q.add(source);
		visted[source] = true;

		while (!q.isEmpty()) {
			int current = q.poll();
			System.out.print(current + " ");

			// get all adjacent vertices of the dequeued vertex current
			for (int neighbor : edges[current]) {
				if (!visted[neighbor]) {
					visted[neighbor] = true;
					q.add(neighbor);
				}
			}
		}
		System.out.println();
	}
	public void bfsTraversal(int source,int destination) {

		boolean visted[] = new boolean[edges.length];
		Queue<Integer> q = new LinkedList<>();

		q.add(source);
		visted[source] = true;

		while (!q.isEmpty()) {
			int current = q.poll();
			System.out.print(current + " ");
			if(current==destination) {
				break;
			}

			// get all adjacent vertices of the dequeued vertex current
			for (int neighbor : edges[current]) {
				if (!visted[neighbor]) {
					visted[neighbor] = true;
					q.add(neighbor);
				}
			}
		}
		System.out.println();
	}
}

public class DSA_bfs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Create the Graph using keyboard
//		System.out.println("Enter number of vertices and edges");
//		int v = sc.nextInt();
//		int e = sc.nextInt();
//
//		Graph graph = new Graph(v);
//		System.out.println("Enter the edges");
//		for (int i = 0; i < e; i++) {
//			int source = sc.nextInt();
//			int destination = sc.nextInt();
//
//			graph.addEdge(source, destination);
//		}

		
		//Create the Graph without keyboard
        int v = 9;
        Graph graph = new Graph(v);
 
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
		

		graph.bfsTraversal(0);
		graph.bfsTraversal(0,6);
		
		
		sc.close();
	}
}