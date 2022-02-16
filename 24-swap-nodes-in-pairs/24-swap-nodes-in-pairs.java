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
    
    public ListNode rev(ListNode head){
        
        ListNode temp=head;
        ListNode prev=null;
        
        while(temp!=null){
            
            ListNode next=temp.next;
            
            temp.next=prev;
            prev=temp;
            temp=next;
            
        }
        head=prev;
        
        return head;
        
    }
    
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)return head;
        
        //here onwards at least 2 node present
        
        ListNode prev=null;
        
        ListNode temp=head;
        
        int i=1;
        
        ListNode temp1=null;
        while(temp!=null){
            
            if(i==2){
                ListNode next=temp.next;
                
                temp1.next=next;
                temp.next=temp1;
                 
                if(prev!=null){
                    prev.next=temp;
                }else{
                    head=temp;
                }
                prev=temp1;
                i=1;
                temp=next;
            }else{
                temp1=temp;
               temp= temp.next;
                i++;
            }
            
        }
        
        // System.out.println("this");
        return head;
    }
}