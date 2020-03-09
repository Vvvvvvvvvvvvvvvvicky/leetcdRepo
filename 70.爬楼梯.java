/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    //1:1  2:2  3:3  4:5 5:8   ...斐波那契数列

    // 1 1
    // 2

    // 1 1 1
    // 1 2
    // 2 1

    // 1 1 1 1
    // 1 1 2
    // 1 2 1
    // 2 1 1
    // 2 2


    // 1 1 1 1 1
    // 1 1 1 2
    // 1 1 2 1
    // 1 2 1 1
    // 1 2 2
    // 2 1 1 1
    // 2 1 2
    // 2 2 1
    public int climbStairs(int n) {
        //用一个变量记录已经计算过的值，不会超时?
        if(n <= 2) 
            return n;
        int first=1,second=2,current=0;
        for(int i=3;i<=n;i++){
            current = first + second;
            first = second;
            second = current;
        }
        return current;
    }
}
// @lc code=end

