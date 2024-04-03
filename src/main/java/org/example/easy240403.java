package org.example;


import javax.sound.midi.Soundbank;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || original == target) {
            return cloned;
        }
        TreeNode leftRes = getTargetCopy(original.left, cloned.left, target);
        if (leftRes != null) {
            return leftRes;
        }
        return getTargetCopy(original.right, cloned.right, target);
    }
}

public class easy240403 {
    //    psvm,sout
    public static void main(String[] args) {
        TreeNode tree1Root = new TreeNode(7);
        tree1Root.left = new TreeNode(4);
        tree1Root.right = new TreeNode(3);
        tree1Root.right.left = new TreeNode(6);
        tree1Root.right.right = new TreeNode(19);
        Solution a;
        a =new Solution();
        System.out.println(a.getTargetCopy(tree1Root, tree1Root, tree1Root.right).val);
    }
}
