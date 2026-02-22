class Solution {
    public ListNode rotateRight(ListNode head, long k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int len = 1;

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        k = k % len;
        if (k == 0)
            return head;

        temp.next = head;   // make circular
        temp = head;

        for (int i = 1; i < len - k; i++)
            temp = temp.next;

        head = temp.next;
        temp.next = null;

        return head;
    }
}
