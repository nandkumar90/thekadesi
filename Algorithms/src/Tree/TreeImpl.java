package Tree;

public class TreeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Node treeRoot=CreateTree.treeConstruction();
       
      TreeTravrsing travrsing=new TreeTravrsing();
      travrsing.inorder(treeRoot);
      
     travrsing.postorder(treeRoot);
      
      travrsing.preorder(treeRoot);
      
	}

}
