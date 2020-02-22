import javax.sound.sampled.SourceDataLine;

/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                count++;
            }else if(count > 0){
                nums[i-count] = nums[i];
            }
        }
        return nums.length-count;
    }
}
// @lc code=end

