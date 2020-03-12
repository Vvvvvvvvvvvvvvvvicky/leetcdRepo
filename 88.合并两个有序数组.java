/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //倒着处理，逐一对比
        int lastIndex = m+n-1;
        while(n>0){
            if(m>0&&nums1[m-1]>nums2[n-1]){
                nums1[lastIndex--] = nums1[--m];
            }else{
                nums1[lastIndex--] = nums2[--n];
            }
        }
    }
}
// @lc code=end

