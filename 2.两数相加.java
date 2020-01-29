/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode result = new ListNode(0);
        ListNode d = result;
        int sum = 0;
        while(l1!=null||l2!=null){
            sum /=10;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            d.next = new ListNode(sum%10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return result.next;
    }
}
// @lc code=end

