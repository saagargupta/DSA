class Node {
	int data;
	Node right, left;

	Node(int item) {
		data = item;
		right = left = null;
	}
}

public class Level_order_traversal {

	Node root;

	public static void main(String[] args) {

		Level_order_traversal tree = new Level_order_traversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(31);

		System.out.println("Level order traversal");
		tree.printlevelorder();

	}

	private void printlevelorder() {
		// TODO Auto-generated method stub
		int h = height(root);
		System.out.println(h);
		for (int i = 1; i <= h; i++) {
			print_current_level(root, i);
		}

	}

	private void print_current_level(Node root2, int level) {
		// TODO Auto-generated method stub
		if (root2 == null)
			return;

		if (level == 1)
			System.out.print(root2.data + " ");
		else if (level > 1) {
			print_current_level(root2.left, level - 1);
			print_current_level(root2.right, level - 1);
		}
	}

	private int height(Node root2) {
		// TODO Auto-generated method stub
		if (root2 == null)
			return 0;
		else {
			int lheight = height(root2.left);
			int rheight = height(root2.right);

			if (lheight > rheight)
				return lheight + 1;
			else
				return rheight + 1;
		}
	}

}
