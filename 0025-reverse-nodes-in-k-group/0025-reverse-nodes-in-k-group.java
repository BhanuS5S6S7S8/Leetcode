/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head ; 
        int height = 0 ;
        while(temp != null){
            height++ ; 
            temp = temp.next ; 
        }
        ListNode preGroup = null ; 
        ListNode curr = head ;
        while(height >= k){
            int a = k ;
            ListNode start = curr ;
            ListNode prev = null ; 

            while(a > 0){
                ListNode nex = curr.next ; 
                curr.next = prev ;
                prev = curr ; 
                curr = nex ;  
                a-- ; 
            }
            
            if(preGroup == null) {
                head = prev;
            } else {
                preGroup.next = prev;
            }

            preGroup = start ;
            preGroup.next = curr;
            height -= k ; 
        }
        return head ; 
    }
}