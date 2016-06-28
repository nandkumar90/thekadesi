package Tree;

//Java program to find maximum sum leaf to root path in Binary Tree

//A Binary Tree node

class Maximum {

 int max_no = Integer.MIN_VALUE;
}

class BinaryTree {

 static Node root;
 Maximum max = new Maximum();

 // A utility function that prints all nodes on the 
 // path from root to target_leaf
 boolean printPath(Node node, Node target_leaf) {
      
     // base case
     if (node == null) {
         return false;
     }
      
     // return true if this node is the target_leaf or target leaf is present in
     // one of its descendants
     if (node == target_leaf || printPath(node.left, target_leaf)
             || printPath(node.right, target_leaf)) {
         System.out.print(node.data + " ");
         return true;
     }

     return false;
 }

 // This function Sets the target_leaf_ref to refer the leaf node of the 
 // maximum path sum.  Also, returns the max_sum using max_sum_ref
 void getTargetLeaf(Node node, Maximum max_sum_ref, int curr_sum, 
                                          Node target_leaf_ref) {
     if (node == null) {
         return;
     }

     // Update current sum to hold sum of nodes on path from root to this node
     curr_sum = curr_sum + node.data;
     int a = max_sum_ref.max_no;
      
     // If this is a leaf node and path to this node has maximum sum so far,
     // the  n make this node target_leaf
     if (node.left == null && node.right == null) {
         if (curr_sum > max_sum_ref.max_no) {
             max_sum_ref.max_no = curr_sum;
             target_leaf_ref = node;

         }
     }
      
     // If this is not a leaf node, then recur down to find the target_leaf
     getTargetLeaf(node.left, max_sum_ref, curr_sum, target_leaf_ref);
     getTargetLeaf(node.right, max_sum_ref, curr_sum, target_leaf_ref);
     Node node1 = target_leaf_ref;
     if (curr_sum > a && a > 0) {
         printPath(root, target_leaf_ref);
     }
 }

 // Returns the maximum sum and prints the nodes on max sum path
 int maxSumPath(Node node) {

     // base case
     if (node == null) {
         return 0;
     }
     Node target_leaf = null;

     // find the target leaf and maximum sum
     getTargetLeaf(node, max, 0, target_leaf);

     // print the path from root to the target leaf
     //printPath(node, target_leaf);
     return max.max_no;  // return maximum sum
 }

 // driver function to test the above functions
 public static void main(String args[]) {
     BinaryTree tree = new BinaryTree();
     tree.root = new Node(10);
     tree.root.left = new Node(-2);
     tree.root.right = new Node(7);
     tree.root.left.left = new Node(8);
     tree.root.left.right = new Node(-4);
     System.out.println("Following are the nodes on maximum sum path");
     int sum = tree.maxSumPath(root);
     System.out.println("");
     System.out.println("Sum of nodes is : " + sum);
 }
}