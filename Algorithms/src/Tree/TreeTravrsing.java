package Tree;

public class TreeTravrsing {

	void inorder(Node node) {
		if (node != null) {
			inorder(node.getLeft());
			System.out.println(node.getData());
			inorder(node.getRight());
		}
	}

	
	void preorder(Node node) {
		if (node != null) {
			System.out.println(node.getData());
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	
	void postorder(Node node) {
		if (node != null) {
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.println(node.getData());

		}
	}
	
}
