
class Solution {
    public ListNode reverseList(ListNode head){
        if (head == null ||  head.next == null){
            return head ; 
        }
        ListNode temp = head ; 
        ListNode prev = null ; 
        ListNode curr = head ; 
        while(curr != null){
            ListNode nex = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = nex ;
        }

        return prev ; 
    }
}