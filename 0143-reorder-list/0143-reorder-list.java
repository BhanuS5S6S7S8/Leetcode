class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        int size = 0 ;
        ListNode temp = head ; 
        while(temp != null){
            size++ ; 
            temp = temp.next ; 
        }
        temp = head ;
        for(int i = 1 ; i < (size+1)/2 ; i++){
            temp = temp.next ; 
        }

        ListNode second = temp.next ; 
        temp.next = null;

        ListNode prev = null ; 
        ListNode curr = second ; 
        ListNode nex = curr.next ; 
        while(curr != null){
            nex = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = nex ; 
        }
        ListNode first = head ; 
        second = prev ; 
        while(second != null){
            ListNode fi = first.next ; 
            ListNode se = second.next ; 

            first.next = second; 
            second.next = fi ; 

            first = fi ; 
            second = se ;
        }
    }
}