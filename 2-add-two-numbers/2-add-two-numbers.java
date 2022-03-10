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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head=null;
        ListNode prev=null;
        
        int carry=0;
        
        while(l1!=null || l2!=null){
            int f=0;
            int s=0;
            
            if(l1!=null)
            {
                f=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null)
            {
                s=l2.val;
                l2=l2.next;
            }
            
            int net=s+f+carry;
            
                // if(carry!=-1) net+=carry;
            
            carry=net/10;
            
            ListNode nn=new ListNode(net%10);
            
            // System.out.println(net);
            
            if(head==null){
                head=nn;
            }else{
                prev.next=nn;
            }
            prev=nn;
        }
        
    if(carry!=0){
        ListNode nn=new ListNode(carry);
        prev.next=nn;
    }
        
        return head;
        
    }
}