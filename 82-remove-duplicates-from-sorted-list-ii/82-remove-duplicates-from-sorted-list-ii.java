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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null) return null;
        
        ListNode temp=head;
        ListNode prev=null;  
        
        while(temp!=null && temp.next!=null){
            
            ListNode next=temp.next;
            
            if(temp.val==next.val){
                
                while(next!=null && temp.next.val==next.val){
                    next=next.next;
                }
                if(prev!=null)
                prev.next=next;
                temp=next;
            }else{
                if(prev==null) head=temp;
                prev=temp;
                temp=next;
            } 
        }
        if(prev==null && temp==null) return null;
        
        if(prev==null && temp!=null) return temp;
        
        return head;
    }
}