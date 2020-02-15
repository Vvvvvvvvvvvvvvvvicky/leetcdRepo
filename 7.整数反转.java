/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        if(x == 0){
            return x;
        }
        long result = 0;
        int abs_x = Math.abs(x);
        while(abs_x>0){
            result = (result * 10 + (abs_x % 10))
                        >Integer.MAX_VALUE?0:(result * 10 + (abs_x % 10));
            abs_x = abs_x / 10;
        }
        if(x<0){
            result = 0 - result;
        }
        return (int)result;
    }
}
// @lc code=end

