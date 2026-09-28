
class Solution {
    public ListNode reverseList(ListNode head){
        return reverse(head , null) ;  
    }
    public ListNode reverse(ListNode head , ListNode prev ){
        if(head == null){
            return prev ; 
        }

        ListNode nex = head.next ; 
        head.next = prev ;

        return reverse(nex , head) ; 
    }
}