class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return null ;
        }
        flat(head) ; 
        return head ;
    }
    public Node flat(Node head){
        Node curr = head ;
        Node last = head ;
        while(curr != null){
            Node nex = curr.next ;
            if(curr.child != null){
                Node chi = curr.child ; 
                Node tail = flat(curr.child) ; 

                curr.next = chi ;
                chi.prev = curr ;

                if(nex != null){
                    tail.next = nex ;
                    nex.prev = tail ; 
                }
                curr.child = null ;

                last = tail ; 
            }
            else{
                last = curr ; 
            }
            curr = nex ; 
        } 
        return last ; 
    }
}