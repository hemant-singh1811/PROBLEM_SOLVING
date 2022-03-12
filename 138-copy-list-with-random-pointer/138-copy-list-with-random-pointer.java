/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
    public Node copyRandomList(Node head) {
    
        Node newhead=null;
        Node temp=head;
        Node prev=temp; 
        
        // Node[] point=new Node[1001];
        
        HashMap<Node,Node> map=new HashMap<>();
        int i=0;
        while(temp!=null){
            
            Node nn=new Node(temp.val);
            
            if(newhead==null){
                newhead=nn;
                prev=nn;
            }else{
                prev.next=nn;
                prev=nn;
            }
            // point[i]=nn;
            map.put(temp,nn);
            
            temp=temp.next; 
            i++;
        } 
        
         temp=head; 
        
        Node temp1=newhead; 
        
        while(temp!=null){
             if(temp.random!=null && map.containsKey(temp.random)){ 
                 temp1.random=(map.get(temp.random));
             }
            temp=temp.next;
            temp1=temp1.next;
            // i++;     
        }
        
         
        return newhead; 
    }
     
    
}