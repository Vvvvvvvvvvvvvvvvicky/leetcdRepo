/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
            }else if(nums[i]<target){
                index=i+1;
            }
        }
        return index;
    }
}
// @lc code=end

