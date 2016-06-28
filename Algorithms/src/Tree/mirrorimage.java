package Tree;

public class mirrorimage {
	public static void main(String[] args){}
	
	
	public Node  mirror(Node node) 
	{
	  if (node==null) 
	    return null;  
	  else
	  {
	    Node temp;
	     
	    /* do the subtrees */
	    mirror(node.getLeft());
	    mirror(node.getRight());
	 
	    /* swap the pointers in this node */
	    temp        = node.getLeft();
	    node.setLeft(node.getRight());
	    node.setRight(temp);
	  }
	return node;
	} 

}
