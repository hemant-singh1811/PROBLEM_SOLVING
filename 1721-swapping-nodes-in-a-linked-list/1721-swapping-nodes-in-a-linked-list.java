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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null) return null;
        
        ListNode temp=head;
        
        int n=0;
        
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        
        if(k>n){
            return head;
        }
        
        int size=n-k+1;
        
        temp=head;
        int t=1;
        
        while(t!=size){
            temp=temp.next;
            t++;
        }
        
        ListNode t1=head;
        
        while(k!=1){
            k--;
            t1=t1.next;
        }
        
        int val=t1.val;
        t1.val=temp.val;
        temp.val=val;
        
        return head;
        
    }
}