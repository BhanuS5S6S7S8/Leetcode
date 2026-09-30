class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int height = 0 ; 
        ListNode temp = head ; 
        while(temp != null){
            height++ ; 
            temp = temp.next ; 
        }
        if(n == height){
            return head.next ; 
        }
        int ans = height - n ;
        temp = head ; 
        for(int i = 1 ; i < ans ; i++){
            temp = temp.next ;
        }
        if(temp.next.next != null ){
            temp.next = temp.next.next ;
        } else{
            temp.next = null ; 
        }

        return head ; 
    }
}