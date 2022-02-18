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
   
    
    public static ListNode rev(ListNode head){
        
        ListNode nhead=null;
        ListNode prev=null;
        ListNode temp=head;
        
        while(temp!=null){
            
            ListNode nn=new ListNode(temp.val);
            
            nn.next=prev;
                       
            temp=temp.next;
            prev=nn;            
        }
        
        return prev;
    }
    
    public int pairSum(ListNode head) {
        
        int max=Integer.MIN_VALUE;
        
        ListNode rev=rev(head);
        
        ListNode temp=head;
        
        while(temp!=null){
            int f=temp.val;
            int s=rev.val;
            // System.out.print(s+" ");
            max=Math.max(max,f+s);
            temp=temp.next;
            rev=rev.next;
        }
        return max;
    }
}