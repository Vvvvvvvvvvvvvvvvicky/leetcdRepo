/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String x_str = Integer.toString(x);
        char[] x_arr = x_str.toCharArray();
        int x_len = x_arr.length;
        int i = 0;
        int j = x_len-1;
        System.out.println(x_len);
        while((j-i) >=0){
            if(x_arr[i++] != x_arr[j--]) return false;
        }
        return true;
    }
}
// @lc code=end

