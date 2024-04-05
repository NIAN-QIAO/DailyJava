package org.example;

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

class Solution {
    private int res;

    public int maxAncestorDiff(TreeNode root) {
        DFS(root, root.val, root.val);
        return res;
    }

    private void DFS(TreeNode node, int mn, int mx) {
        if (node == null) {
            res = Math.min(mn, node.val);
            return;
        }
        mn = Math.min(mn, node.val);
        mn = Math.max(mn, node.val);
        DFS(node.left, mn, mx);
        DFS(node.right, mn, mx);
    }
}

public class medium240405 {

}
