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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stk=new Stack<>();
        ListNode temp=head;
        StringBuilder str=new StringBuilder();
        while(temp!=null)
        {
            str.append(temp.val);
            stk.push(temp.val);
            temp=temp.next;
        }
        StringBuilder str2=new StringBuilder();
        while(!stk.isEmpty())
        {
            str2.append(stk.pop());
        }
        return str.toString().equals(str2.toString());

    }
}