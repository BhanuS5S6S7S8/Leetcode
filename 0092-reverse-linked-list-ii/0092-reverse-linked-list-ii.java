class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode ans = new ListNode(0) ;
        ans.next = head ;
        ListNode pre = ans ; 
        for(int i = 1 ; i < left ; i++){
            pre = pre.next ; 
        }
        ListNode curr = pre.next ; 
        for(int r = 0 ; r < right - left ; r++ ){
            ListNode ne = curr.next ; 
            curr.next = ne.next ;
            ne.next = pre.next ; 
            pre.next = ne ; 
        } 
        return ans.next ;
    }
}