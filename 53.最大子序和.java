/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max_total = nums[0];
        int temp_total = 0;
        int temp_max_total;
        int temp_j;
        int max_i = 0;
        int max_j = 0;
        for(int i=0;i<nums.length;i++){
            temp_total = nums[i];
            temp_max_total = nums[i];
            temp_j = i;
            for(int j=i+1;j<nums.length;j++){
                temp_total += nums[j];
                //每轮得出最大和
                if(temp_total >= temp_max_total){
                    temp_max_total = temp_total;
                    temp_j = j;
                }
            }
            //全局最大子序和
            if(temp_max_total>=max_total){
                max_total = temp_max_total;
                max_i = i;
                max_j = temp_j;
            };
        }
        return total(max_i, max_j, nums);
    }
    public int total(int i,int j,int[] nums){
        int total = 0;
        for(int k=i;k<=j;k++){
            total += nums[k];
        }
        return total;
    }
}
// @lc code=end

