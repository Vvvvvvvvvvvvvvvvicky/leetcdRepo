/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        int max_num = nums[0];
        int index = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max_num){
                nums[++index]=nums[i];
                max_num = nums[i];
            }
        }

        return index+1;
    }
}
// @lc code=end

