class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pre = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        ListNode temp = head;
        while (pre != null) {
            if (temp.val != pre.val) {
                return false;
            }

            temp = temp.next;
            pre = pre.next;
        }

        return true;
    }
}