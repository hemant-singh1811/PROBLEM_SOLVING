class Solution {
	// Implement a basic linked list node
    public class Node {
        int val;
        Node next;
        
        public Node(int val) {
            this.val = val;
        }
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        var mMax = mat.length;
        var nMax = mat[0].length;

        var toReturn = new int[k];
        var foundCount = 0;
		
		// Use a dummy root node to anchor the list
        var dummy = new Node(-1);
        var current = dummy;
		
		// Create the list of rows
        for (var i = 0; i < mMax; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        current = dummy;
		
		// For each column, while the list has contents
        for (var i = 0; i < nMax && current.next != null; i++) {
			// Iterate through the remaining rows we haven't yet added to the results
            while (current.next != null) {
				// We are iterating rows in i < j order, so if we find a weak row, add it immediately. Remove it from the linked list
                if (mat[current.next.val][i] == 0) {
                    toReturn[foundCount++] = current.next.val;                  
                    if (foundCount == k) return toReturn; // If we're done, return ASAP
                    current.next = current.next.next;
                }
                else {
                    current = current.next;  
                }
            }
            current = dummy; // Reset the linked list pointer for the next iteration
        }
		
		// If we have nodes left, the rows are all 1s. Add them until we're done.
        while (foundCount < k) {
            toReturn[foundCount++] = dummy.next.val;
            dummy.next = dummy.next.next;
        }

        return toReturn;
    }
}