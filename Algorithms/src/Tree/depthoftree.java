package Tree;

public class depthoftree {

	int h;
	public static int depth(Node root){
		int l = 0, r = 0;
		if(root==null)
			return 0;
		
		else {
			if (root.getLeft() != null)
				l = depth(root.getLeft());
			if (root.getRight() != null)
				r = depth(root.getRight()
						);
			return l > r ? l + 1 : r + 1;

		}

		
		
	}
	
	
}
