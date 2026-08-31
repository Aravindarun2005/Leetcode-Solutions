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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode temp1,temp2;
        dummy.next=head;
        int c=0;
        while(curr.next!=null && curr.next.next!=null)
        {
            temp1=curr.next;
            temp2=curr.next.next;
            temp1.next=temp2.next;
            temp2.next=temp1;
            curr.next=temp2;
            curr=temp1;
        }
        return dummy.next;
    }
}