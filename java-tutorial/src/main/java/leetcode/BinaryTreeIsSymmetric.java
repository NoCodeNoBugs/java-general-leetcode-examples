package leetcode;


/*
101. Symmetric Tree
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3

 */


public class BinaryTreeIsSymmetric {

    public boolean isSymmetric(TreeNode root){

        if(root == null) return true;


        return (checkSymmetric(root.left, root.right));
    }


    public boolean checkSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null) return true;

        if (left == null || right == null) return false;

        if ((left.val == right.val) && checkSymmetric(left.left, right.right) &&
                checkSymmetric(left.right, right.left)) {
            return true;
        }
        return false;
    }

}
