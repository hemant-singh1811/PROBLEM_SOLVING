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
    public ListNode rotateRight(ListNode head, int k) {
    
        if(head==null) return null;
        int size=0;
        
        ListNode temp=head;
        
        while(temp!=null){
            
            size++;
            temp=temp.next;            
        }
        
        int numrot=k%size;
         
        temp=head;
        
        ListNode temp1=head;
        
        int i=0;
        
        ListNode prev=null;
         
        while(temp!=null && numrot!=0){
            i++;
            prev=temp;
            temp=temp.next;
            
            if((size-i)==numrot){
                 head=temp;    
                 prev.next=null; 
            }            
         }
        
        if(prev!=null)
        prev.next=temp1;
        
        return head;
    }
    
}