import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	int V;
	LinkedList<Integer> adj[];

	BFS(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}

	public static void main(String args[]) {
		BFS g = new BFS(4);

		g.addedge(0, 1);
		g.addedge(0, 2);
		g.addedge(1, 2);
		g.addedge(2, 0);
		g.addedge(2, 3);
		g.addedge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.bfs(2);
	}

	void addedge(int u, int v) {
		adj[u].add(v);
	}

	void bfs(int s) {
		boolean visited[] = new boolean[V];

		Queue<Integer> queue = new LinkedList<>();

		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");

			Iterator<Integer> it = adj[s].listIterator();

			while (it.hasNext()) {
				int n = it.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}

	}

}
