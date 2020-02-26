/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        String[] s_strs = s.split(" ");
        if(s_strs.length == 0)
            return 0;
        else
            return s_strs[s_strs.length-1].length();
    }
}
// @lc code=end

