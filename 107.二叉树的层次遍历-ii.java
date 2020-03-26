import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        in(root, 0);
        Collections.reverse(list);
        return list;
    }

    public void in(TreeNode root,int index){
        if(root==null){
            return;
        }
        
        if(list.size()<=index) list.add(new ArrayList<>());
        list.get(index).add(root.val);
        in(root.left,index+1);
        in(root.right,index+1);

    }

    
}
// @lc code=end

