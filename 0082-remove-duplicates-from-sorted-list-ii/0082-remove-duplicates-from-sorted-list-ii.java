class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head ; 
        }
        ListNode dupli = new ListNode(0) ; 
        dupli.next = head ; 

        ListNode prev = dupli ; 
        ListNode curr = head ; 
        while(curr != null){
            if(curr.next != null && curr.next.val == curr.val){
                int value = curr.val ; 
                while(curr != null && value == curr.val ){
                    curr = curr.next ; 
                }
                prev.next = curr ;
            }else{
                prev = curr ; 
                curr = curr.next ; 
            }
        }
        return dupli.next ; 
    }
}