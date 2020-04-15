package leetcode;



/* Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.*/

/*Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class KthSamllestElement {

    public int kthSmallestElement(TreeNode root, int k){


        if(root == null) {
            return -1;
        }
        List<Integer> list = new ArrayList<>();

        helper(root, list);

        return list.get(k-1);

    }

    public void helper(TreeNode root, List<Integer> list){

        if(root == null) return;

        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }

}
