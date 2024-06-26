class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;

   TreeNode() {
   }

   TreeNode(int val) {
      this.val = val;
   }

   TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
   }
}

public class TreeTraversal {
   int sum = 0;

   private void traversal(TreeNode root) {
      if (root == null)
         return;
      traversal(root.right);
      sum += root.val;
      root.val = sum;
      traversal(root.left);
   }

   public static void main(String[] args) {
      // Create the tree structure
      // [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
      TreeNode root = new TreeNode(4);
      root.left = new TreeNode(1);
      root.right = new TreeNode(6);
      root.left.left = new TreeNode(0);
      root.left.right = new TreeNode(2);
      root.right.left = new TreeNode(5);
      root.right.right = new TreeNode(7);
      root.left.right.right = new TreeNode(3);
      root.right.right.right = new TreeNode(8);

      // root.left.left.left = null;
      // root.left.left.right = null;
      // root.left.right.left = null;
      // root.right.left.left = null;
      // root.right.left.right = null;
      // root.right.right.left = null;

      TreeTraversal obj = new TreeTraversal();
      obj.traversal(root);

      // Print the new values of the tree (in-order traversal)
      printInOrder(root);
   }

   private static void printInOrder(TreeNode node) {
      if (node == null) {
         return;
      }
      printInOrder(node.left);
      System.out.print(node.val + " ");
      printInOrder(node.right);
   }
}
