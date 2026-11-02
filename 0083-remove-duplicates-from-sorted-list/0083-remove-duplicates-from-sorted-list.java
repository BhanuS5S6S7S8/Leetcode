class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head ; 
        }
        ListNode prev = head ; 
        ListNode curr = head.next ; 
        while(curr != null){
            if(prev.val == curr.val){
                while(curr != null && prev.val == curr.val){
                    curr = curr.next ; 
                }
                prev.next = curr ; 
            }else{
                prev = curr ;   
                curr = curr.next ; 
            }
        }
        return head ; 
    }
}