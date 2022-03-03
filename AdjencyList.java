import java.util.*;
public class AdjencyList {

	static int v;
	static LinkedList <Integer> adj[];
	
	
	
	@SuppressWarnings("unchecked")
	AdjencyList(int v)
	{
		AdjencyList.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList<Integer>();
	}
	public static void main(String[] args) {
		AdjencyList ad=new AdjencyList(4);
		
		ad.addEdge(0, 1);
	    ad.addEdge(0, 2);
	    ad.addEdge(0, 3);
	    ad.addEdge(1, 2);

	    ad.printGraph();
		

	}
	
	void addEdge(int u,int v)
	{
		adj[u].add(v);
		adj[v].add(u);
	}
	
	
	void printGraph()
	{
		for(int i=0;i<adj.length;i++)
		{
			System.out.println("\nvertex "+i+":");
			for(int j=0;j<adj[i].size();j++)
			{
				System.out.print("-> "+adj[i].get(j));
			}
		}
	}
	

}
