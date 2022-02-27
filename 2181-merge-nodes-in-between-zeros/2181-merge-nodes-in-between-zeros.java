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
    public ListNode mergeNodes(ListNode head) {
     
        if(head==null) return null;
        
        ListNode nhead=null;
        ListNode prev=null;
        
        int sum=0;
        
        ListNode temp=head;
        int zero=0;
        
        while(temp!=null){
            
            if(temp.val!=0){
               
                sum+=temp.val;
                
            }else{
                zero++;
                
            }
            if(zero==2 && sum!=0){
                ListNode nn=new ListNode(sum);
                
                if(prev!=null){
                    prev.next=nn;
                    prev=nn;
                }else{
                    nhead=nn;
                    prev=nn;
                }
                sum=0;
                
                zero=1;
            }
            
            
            temp=temp.next;
        }
        return nhead;
    }
}