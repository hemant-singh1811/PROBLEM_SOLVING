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
    public ListNode sortList(ListNode head) {
     
        int size=0;
        ListNode tmp=head;
        
        while(tmp!=null){
            size++;
            tmp=tmp.next;
        }
        
        int[] arr=new int[size];
        
        tmp=head;
        int i=0;
        while(tmp!=null){
            arr[i]=tmp.val;
            i++;
            tmp=tmp.next;
        }
        
        Arrays.sort(arr);
        
          i=0;
        tmp=head;
        
        while(tmp!=null){
            tmp.val=arr[i];
            i++;
            tmp=tmp.next;
        }
        
        
        return head;
        
    }
}