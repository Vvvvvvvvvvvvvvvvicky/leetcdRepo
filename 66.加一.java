/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]%10 != 0){
                return digits;
            }else{
                digits[i]=0;
            }
        }

        //倒序执行到第一位时，还没有返回，说明全是9，例如：99->100
        int[] new_digits = new int[digits.length+1];
        new_digits[0] = 1;
        return new_digits;
    }
}
// @lc code=end

