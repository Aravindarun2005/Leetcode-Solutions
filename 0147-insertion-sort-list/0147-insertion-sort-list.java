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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> ar=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            ar.add(temp.val);
            temp=temp.next;
        }
        int[] arr=new int[ar.size()];
        for(int i=0;i<ar.size();i++)
        {
            arr[i]=ar.get(i);
        }
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        temp=head;
        int k=0;
        while(temp!=null)
        {
            temp.val=arr[k];
            temp=temp.next;
            k++;
        }
        return head;
    }
}