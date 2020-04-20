package leetcode;

/*
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4
  / \
 1   2

 Return true, because t has the same structure and node
 values with a subtree of s.
*/

public class IsSubTree {

    public boolean isSubtree(TreeNode s, TreeNode t){


        if(s == null) {
            return false;
        }

        if (isIdentical(s, t))
            return true;

        return isSubtree(s.left, t.left) || isSubtree(s.right, t.right);
    }

    public boolean isIdentical(TreeNode s, TreeNode t){


        if(s == null && t == null)
            return  true;

        if(s == null || t == null)
            return false;

        if(s.val != t.val)
            return false;

        return isIdentical(s.left, t.left) && isIdentical(s.right, t.right);


    }
}
