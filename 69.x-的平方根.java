/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        //用x/i<i而不是i*i>x防止溢出
        for(int i=1;;i++){
            if(x/i == i){
                return i;
            }else if(x/i < i){
                return --i;
            }
        }
    }
}
// @lc code=end

