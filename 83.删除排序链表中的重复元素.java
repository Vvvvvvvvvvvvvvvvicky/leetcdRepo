import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head = head.next : head;
    }
}
// @lc code=end

