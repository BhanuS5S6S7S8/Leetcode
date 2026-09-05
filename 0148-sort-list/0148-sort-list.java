class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){ 
            return head ;
        }
        List<Integer> ans = new ArrayList<>() ;
        ListNode temp = head ; 
        while(temp != null){
            ans.add(temp.val) ; 
            temp = temp.next ; 
        }
        int[] lis = new int[ans.size()] ; 
        for(int i = 0 ; i< ans.size() ; i++){
            lis[i] = ans.get(i) ; 
        }
        Arrays.sort(lis) ; 
        ListNode dummy = new ListNode(0) ; 
        ListNode copy = dummy ; 
        for(int i = 0 ; i < lis.length ; i++){
            ListNode dumm = new ListNode(lis[i]) ; 
            copy.next = dumm ; 
            copy = copy.next ; 
        }
        return dummy.next ;
    }
}