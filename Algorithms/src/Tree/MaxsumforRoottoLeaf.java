package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.text.StyledEditorKit.BoldAction;

public class MaxsumforRoottoLeaf {
	static Node root;
	int current, depth=0;
	public static LinkedList<Node> path = new LinkedList<Node>();
	public static  MaxPath maxPath=new MaxPath(0, path);
	public static LinkedList<Node>path1=new LinkedList<Node>();
	public static LinkedList<Node>path2=new LinkedList<Node>();

	public static void main(String[] args) {
		MaxsumforRoottoLeaf tree = new MaxsumforRoottoLeaf();
         tree.root = new Node(10);
	     tree.root.left = new Node(-2);
	     tree.root.right = new Node(7);
	     tree.root.left.left = new Node(8);
	     tree.root.left.right = new Node(-4);
	     //System.out.println(tree.height(root));
         //labeltraversing.label(root, 2);
	 /* for (int i=1;i<=tree.height(root);i++) {
		  tree.printLevelwiseNode(root, i);
		  System.out.println();
		
	}*/
	     
	   //  tree.breadthFirstNonRecursive();
	   //  LinkedList<Node>list =new LinkedList<Node>();
	    // tree.printLeaf(root);
	     //tree.printAllPathfromRootToLeaf(root, list);
	//tree.inorder(root);
	//tree.printmirrorimage(root);
	//tree.inorder(root);
	    
	
	tree.maxSumPath(root, path, maxPath);
	//System.out.println(maxPath);
	
	   //  tree.nearestancestorForBtree(root, 8, 4);
	     
	}
	
	//nearest ancestor for BST
	public Node nearestancestorForBST(Node node, int n1, int n2){
		if(node==null)
			return null;
		
		if(node.data>n1&& node.data>n2)
			nearestancestorForBST(node.left, n1, n2);
		
		if(node.data<n1&&node.data<n2)
			nearestancestorForBST(node.right, n1, n2);
		
		return node;
		
		
	}
	
	
	//nearest ancestor for  btree
	public Node nearestancestorForBtree(Node node, int n1, int n2){
	
		if(!findpath(node,path1,n1)||!findpath(node,path2,n2))
		return null;
		
		int i=0;
		for(;i<path1.size()&& i<path2.size();i++){
			if(path1.get(1)!=path2.get(i)){
				break;
			}
			
		return path1.get(i-1);	
		}
		return node;	
	}
	
	private Boolean findpath(Node node, LinkedList<Node> path1, int n1) {
		
		if(node==null)
			return false;
		
		path1.push(node);
		System.out.println(node.data);
		
		if(node.data==n1)
			return true;

		if((node.left!=null &&findpath(node.left, path1, n1))||(node.right!=null &&findpath(node.right, path1, n1)))
		{
			
			System.out.println("check");
			return true;
		}
			
		
	    System.out.println(path1.pop());	
		return false;
	}

	 
	
	
	//print maximum sum  path form root to leaf 
	public void maxSumPath(Node node, LinkedList<Node>path,MaxPath max){
		if(node==null)
			return ;
		
		path.offer(node);
		int sum=0;
		if(node.left==null&&node.right==null)
		{   
		    LinkedList<Node>pathi=null;
			for (Node node2 : path) {
				System.out.println("  "+node2.data);
				sum+=node.data;
				pathi.offer(node2);
				
			}
			if(max.max<sum)
			{
				max.max=sum;
				max.path=pathi;
				
			}
			
			path.remove(node);
			System.out.println();
		}
		
		printAllPathfromRootToLeaf(node.left, path);
		printAllPathfromRootToLeaf(node.right, path);
		
		
	}

	// print mirror image
	public void printmirrorimage(Node node) {
		if (node == null)
			return;

		printmirrorimage(node.left);
		printmirrorimage(node.right);
		Node temp = node.left;
		node.setLeft(node.right);
		node.setRight(temp);
	}

	//print tree in order 
	
	public void inorder(Node node){
		if (node==null)
			return;
		
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
		
	}
	
	// to print all leaf
	public void printLeaf(Node node) {

		if (node==null)
			return;
		printLeaf(node.left);
		printLeaf(node.right);
		if(node.left==null&& node.right==null)
			System.out.println("   "+node.data);
		
	}

	//to print all path from root to leaf
	
	public void printAllPathfromRootToLeaf(Node node, LinkedList<Node>path)
	{
		if(node==null)
			return ;
		
		path.offer(node);
		
		if(node.left==null&&node.right==null)
		{
			for (Node node2 : path) {
				System.out.println("  "+node2.data);
			}
			path.remove(node);
			System.out.println();
		}
		
		printAllPathfromRootToLeaf(node.left, path);
		printAllPathfromRootToLeaf(node.right, path);
	
	}
	
	
	//recursive
	public int height(Node node) {
		int l = 0, r = 0;
		if (node == null)
			return 0;

		l = height(node.left);
		r = height(node.right);

		return l > r ? l + 1 : r + 1;

	}
	
	// itrative
	public int inerativeHeight(Node node) {

		if (node != null) {
			current++;
			if (current > depth)
				depth = current;
			inerativeHeight(node.left);
			inerativeHeight(node.right);
			current--;
		}
		return depth;
	}
	
	public int printLevelwiseNode(Node node, int level) {
		if (node == null) {
			return 0;
		}
		if (level == 1)
			System.out.print(" " + node.getData());
		else {

			printLevelwiseNode(node.getLeft(), level - 1);
			printLevelwiseNode(node.getRight(), level - 1);

		}
		return 0;

			}

	public void breadthFirstNonRecursive() {
		Queue<Node> queue = new java.util.LinkedList<Node>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.data);
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
			
		}
	}

}
