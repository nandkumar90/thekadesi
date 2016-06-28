package Tree;

public class labeltraversing {
	public static void main(String[] args){
		Node node=CreateTree.treeConstruction();
		Node temp;
		int h=depth(node);
		for(int i=1;i<=h;i++)
		label(node, i);
	}
	
	public static int depth(Node node){
		int l=0,r=0;
		if(node==null)
			return 0;
		else {
			l=depth(node.getLeft());
			r=depth(node.getRight());
			return l>r?l+1:r+1;	
		}
	}
	
	
	
	
 public static void label(Node node, int level){
	 if(node==null){
		 return ;
	 }
	 if(level==1)
		 System.out.print(" "+node.getData());
	 else{
		 
		 label(node.getLeft(),level-1);
		 label(node.getRight(),level-1);
		 
	 }
	 
	
 }

	// 2nd of leveling
	// Returns level of key k if it is present in tree, otherwise returns -1
	public static int findLevel(Node root, int k, int level) {
		// Base Case
		if (root == null)
			return -1;

		// If key is present at root, or in left subtree or right subtree,
		// return true;
		if (root.getData() == k)
			return level;

		int l = findLevel(root.getLeft(), k, level + 1);
		return (l != -1) ? l : findLevel(root.getRight(), k, level + 1);
	}
 
 
}
