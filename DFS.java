import java.util.*;

public class DFS {

	int V;
	LinkedList<Integer> adj[];

	DFS(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}

	public static void main(String[] args) {

		DFS g = new DFS(4);

		g.addedge(0, 1);
		g.addedge(0, 2);
		g.addedge(1, 2);
		g.addedge(2, 0);
		g.addedge(2, 3);
		g.addedge(3, 3);

		System.out.println("Following is Depth First Traversal ");

		g.dfs();
	}

	void addedge(int u, int v) {
		adj[u].add(v);
	}

	void dfs() {
		boolean visited[] = new boolean[V];

		for (int i = 0; i < V; i++) {
			if (visited[i] == false) {
				dfsutil(i, visited);
			}
		}

	}

	void dfsutil(int v, boolean visited[]) {
		
		visited[v]=true;
		System.out.print(v+" ");
		
		Iterator<Integer> it=adj[v].iterator();
		
		while (it.hasNext()) {
			int n = it.next();
			if (!visited[n]) {
				dfsutil(n,visited);
			}
		}

	}

}
