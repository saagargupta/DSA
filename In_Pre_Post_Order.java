//class Node {
//	int data;
//	Node right, left;
//
//	Node(int item) {
//		data = item;
//		right = left = null;
//	}
//}
public class In_Pre_Post_Order {

	static Node root;
	public static void main(String[] args) {
		In_Pre_Post_Order tree = new In_Pre_Post_Order();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		//tree.root.right.left = new Node(31);

		System.out.println("Inorder traversal");
		tree.inorder(root);
		System.out.println("\nPreorder traversal");
		tree.preorder(root);
		System.out.println("\nPostorder traversal");
		tree.postorder(root);
	}

	void inorder(Node node) {
		
		if(node==null)
			return;
		
		inorder(node.left);
		
		System.out.print(node.data +" ");
		
		inorder(node.right);
		
	}
	void preorder(Node node) {
			
			if(node==null)
				return;
			
			System.out.print(node.data+"  ");
			
			preorder(node.left);
						
			preorder(node.right);
			
		}
	void postorder(Node node) {
		
		if(node==null)
			return;
				
		postorder(node.left);
					
		postorder(node.right);
		
		System.out.print(node.data+"  ");
		
	}
}
