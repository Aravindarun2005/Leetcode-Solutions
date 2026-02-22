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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        temp=head;
        int[] arr=new int[c];
        int[] res=new int[c];
        ArrayList<Integer> ar=new ArrayList<>();
        int k=0;
        while(temp!=null)
        {
            arr[k]=temp.val;
            temp=temp.next;
            k++;
        }
        int ptr1=0;
        int ptr2=c-1;
        k=0;
        while (ptr1 <= ptr2) {
            ar.add(arr[ptr1]);
            // Only add the end element if it's not the same as the start element
            if (ptr1 != ptr2) {
                ar.add(arr[ptr2]);
            }
            ptr1++;
            ptr2--;
        }
        for(int i=0;i<c;i++)
        {
            res[i]=ar.get(i);
        }
        temp=head;
        k=0;
        while(temp!=null)
        {
            temp.val=res[k];
            temp=temp.next;
            k++;
        }
    }
}