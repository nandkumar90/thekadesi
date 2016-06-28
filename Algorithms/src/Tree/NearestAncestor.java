package Tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class NearestAncestor {
	public static void main(String[] args) {

		// CreateTree createTree=new CreateTree();
		Node root = CreateTree.treeConstruction();
		Node ancestor = getNearestAncestorForBtree(root, 1, 3);
		System.out.println(ancestor.getData());

	}

	// for BST
	public static Node getNearestAncestorForBtree(Node node, int n1, int n2) {

		if (node == null)
			return null;

		if (node.getData() < n1 && node.getData() < n2) {
			return getNearestAncestorForBtree(node.getRight(), n1, n2);

		}

		if (node.getData() > n1 && node.getData() > n2) {

			return getNearestAncestorForBtree(node.getLeft(), n1, n2);
		}

		return node;
	}

	// for B tree

	public static Node getLCA(Node root, int n1, int n2) {
		LinkedList<Node> path1 = null, path2 = null;
		if (!findpath(root, n1, path1) || !findpath(root, n2, path2)) {
			return null;
		} else {
			int i;
			for (i = 0; i < path1.size() && i < path2.size(); i++) {

				if (path1.get(i) != path2.get(i)) {
					break;
				}
			}
			return path1.get(i - 1);
		}
	}

	public static boolean findpath(Node node, int n1, LinkedList<Node> path) {

		if (node == null)
			return false;
		path.push(node);

		if (node.getData() == n1)
			return true;

		if (node.getLeft() != null && findpath(node.getLeft(), n1, path)
				|| node.getRight() != null
				&& findpath(node.getRight(), n1, path))
			return true;

		path.pop();
		return false;
	}

}
