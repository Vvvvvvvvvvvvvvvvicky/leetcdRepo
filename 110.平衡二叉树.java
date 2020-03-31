/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return count(root)>=0;
    }

    public int count(TreeNode root){
        if(root==null) return 0;
        int left = count(root.left);
        int right = count(root.right);
        if(left>=0 && right>=0 && Math.abs(left - right)<=1)  //平衡加一
            return Math.max(left, right) +1;    
        else
            return -1;  //不平衡标记为-1；
    }
}
// @lc code=end

