package BackTracking;

import java.util.ArrayList;

public class backtrackingPath
{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode (TreeNode root) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public boolean leafNode (TreeNode root, ArrayList <Integer> path) {
        if (root == null || root.val == 0) {
            return false;
        }
        path.add (root.val);
        if (root.left == null && root.right == null) {
            return true;
        }
        if (leafNode(root.left, path)) {
            return true;
        }
        if (leafNode(root.right, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
    public static void main(String[] args) {

    }
}
