package BackTracking;

public class backtracking {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode (int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public boolean canReachLeaf(TreeNode root) {
        if (root == null || root.val == 0) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return false;
        }
        if (canReachLeaf(root.left)){
            return true;
        }
        if (canReachLeaf(root.right)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}


