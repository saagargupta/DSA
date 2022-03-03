import java.util.LinkedList;

public class DFS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=4;
		LinkedList<Integer> adj[];
		adj=new LinkedList[V];
		for(int i=0;i<V;i++)
		{
			adj[i]=new LinkedList();
		}
		
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);
		
		printAdjacencymatrix(adj);

	}

	private static void printAdjacencymatrix(LinkedList<Integer>[] adj) {
		// TODO Auto-generated method stub
		
	}

	private static void addEdge(LinkedList<Integer>[] adj, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
