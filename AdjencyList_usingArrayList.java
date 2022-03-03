import java.util.ArrayList;
public class AdjencyList_usingArrayList {

	public static void main(String[] args) {
		int v=4;
		ArrayList <ArrayList<Integer>> adj=new ArrayList <ArrayList<Integer>>(v);

		for (int i = 0; i < v; i++)
		      adj.add(new ArrayList<Integer>());
		
		
		addEdge(adj, 0, 1);
	    addEdge(adj, 0, 2);
	    addEdge(adj, 0, 3);
	    addEdge(adj, 1, 2);

	    printGraph(adj);
		

	}
	
	

	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	
	static void printGraph(ArrayList<ArrayList<Integer>> adj)
	{
		for(int i=0;i<adj.size();i++)
		{
			System.out.println("\nvertex "+i+":");
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.print("-> "+adj.get(i).get(j));
			}
		}
	}
	

}
