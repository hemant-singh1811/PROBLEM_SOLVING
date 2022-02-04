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
   ListNode compare(ListNode node1, ListNode node2)
{
    ListNode temp = null;
    if (node1 == null || node2 == null)
    {
        if (node1 != null)
        {
            temp = node1;
        }
        else if (node2 != null)
        {
            temp = node2;
        }
    }
    else
    {
        if (node1.val <= node2.val)
        {
            temp = node1;
            node1 = node1.next;
        }
        else
        {
            temp = node2;
            node2 = node2.next;   
        }
        temp.next = compare(node1, node2);
    }
    return temp;
}

public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    
    ListNode head = compare(list1, list2);  // comapre resturns the reference for the node 
                                            // having lesser value 
    return head;
}
}