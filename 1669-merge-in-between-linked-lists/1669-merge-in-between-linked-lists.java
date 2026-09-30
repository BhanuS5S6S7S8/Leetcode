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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1 ; 
        for(int i = 0 ; i < a-1 ; i++){
            temp = temp.next ; 
        }
        ListNode te = list1 ; 
        for(int j = 0 ; j < b ; j++){
            te = te.next ; 
        }
        temp.next = list2 ; 
        ListNode end = list2 ; 
        while(end.next != null){
            end = end.next ; 
        }
        end.next = te.next ;

        return list1 ;  
    }
}