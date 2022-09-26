/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        if(size == n){
            head = head.next;
            return head;
        }
        
        ListNode curr = head;
        int ptr = size - n;
        int cn = 1;
        while(cn != ptr){
            curr = curr.next;
            cn++;
        }
        
        curr.next = curr.next.next;
        return head;
    }
}