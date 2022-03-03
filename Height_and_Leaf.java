//class Node
//{
//	int data;
//	Node left,right;
//	Node(int item)
//	{
//		data=item;
//		left=right=null;
//	}
//}

public class Height_and_Leaf {

	static Node root;
	public static void main(String args[])
	{
		Height_and_Leaf tree=new Height_and_Leaf();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Height-->> "+height(root)+" \n");
		
		printLeafNode(root);
	}
	static void printLeafNode(Node node) {

		if(node==null)
			return;
		
		if(node.left==null&&node.right==null)
			System.out.print(node.data+" ");
		
		if(node.left!=null)
			printLeafNode(node.left);
		
		if(node.right!=null)
			printLeafNode(node.right);
		
	}
	static int height(Node node)
	{
		if(node==null)
			return 0;
		else {
			
			int lheight=height(node.left);
			int rheight=height(node.right);
			
			return Math.max(lheight, rheight)+1;
		}
	}
}
