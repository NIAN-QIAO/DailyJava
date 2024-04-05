package org.example;


class TreeNode240403 {
    int val;
    TreeNode240403 left;
    TreeNode240403 right;

    TreeNode240403(int x) {
        val = x;
    }
}

class Solution240403 {
    public final TreeNode240403 getTargetCopy(final TreeNode240403 original, final TreeNode240403 cloned, final TreeNode240403 target) {
        if (original == null || original == target) {
            return cloned;
        }
        TreeNode240403 leftRes = getTargetCopy(original.left, cloned.left, target);
        if (leftRes != null) {
            return leftRes;
        }
        return getTargetCopy(original.right, cloned.right, target);
    }
}

public class easy240403 {
    //    psvm,sout

    public static void main(String[] args) {
        TreeNode240403 tree1Root = new TreeNode240403(7);
        tree1Root.left = new TreeNode240403(4);
        tree1Root.right = new TreeNode240403(3);
        tree1Root.right.left = new TreeNode240403(6);
        tree1Root.right.right = new TreeNode240403(19);
        Solution240403 a;
        a =new Solution240403();
        System.out.println(a.getTargetCopy(tree1Root, tree1Root, tree1Root.right).val);
    }
}
