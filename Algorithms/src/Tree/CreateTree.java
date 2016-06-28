package Tree;

public class CreateTree {
  
 static public Node treeConstruction(){
	Node root=new Node(4);
	 root.setLeft(new Node(2));
	 root.setRight(new Node(5));
	 root.getLeft().setLeft(new Node(1));
	 root.getLeft().setRight(new Node(3));
	 return root;
 }
	
}
