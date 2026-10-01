class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0 ){
            return head ; 
        }
        ListNode temp = head ;
        int height = 1 ;  
        while(temp.next != null){
            height++ ;
            temp = temp.next ; 
        }
        k = k % height ;
        while(k > 0){
            temp = head ; 
            while(temp.next.next != null){
                temp = temp.next ; 
            }
            ListNode last = temp.next ; 
            temp.next = null ; 

            last.next = head ; 
            head = last ; 
            k-- ; 
        } 
        return head ; 
    }
}