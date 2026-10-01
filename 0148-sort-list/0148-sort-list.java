class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }
        ArrayList<Integer> arr = new ArrayList<>() ; 
        ListNode temp = head ;
        while(temp != null){
            arr.add(temp.val) ; 
            temp = temp.next ; 
        }
        Collections.sort(arr) ; 
        ListNode dummy = new ListNode(0) ;
        ListNode du = dummy ;
        for(int i = 0 ; i < arr.size() ; i++){
            ListNode dumm = new ListNode(arr.get(i)) ; 
            du.next = dumm ; 
            du = du.next ; 
        }
        return dummy.next ;
    }
}