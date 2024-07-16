import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class MyGraph {

	private LinkedList<Integer> edges[];

	public MyGraph(int v) {
		edges = new LinkedList[v];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int source, int destination) {
		edges[source].add(destination);
		edges[destination].add(source);
	}

	public void dfsTraversal(int source) {
		
		boolean visited[] = new boolean[edges.length];
		Stack<Integer> stack = new Stack<>();

		stack.push(source);
		visited[source] = true;

		while (!stack.isEmpty()) {
			int current = stack.pop();
			System.out.print(current + " ");

			// get all adjacent vertices of the dequeued vertex cur
			for (int neighbor : edges[current]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		System.out.println();
	}
public void dfsTraversal(int source,int destination) {
		
		boolean visited[] = new boolean[edges.length];
		Stack<Integer> stack = new Stack<>();

		stack.push(source);
		visited[source] = true;

		while (!stack.isEmpty()) {
			int current = stack.pop();
			System.out.print(current + " ");
			if(current==destination) {
				break;
			}

			// get all adjacent vertices of the dequeued vertex cur
			for (int neighbor : edges[current]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		System.out.println();
	}
	
}

public class DSA_DFS {
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
        MyGraph graph = new MyGraph(v);
 
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

		graph.dfsTraversal(0);
		graph.dfsTraversal(0,6);
		
		sc.close();
	}
}