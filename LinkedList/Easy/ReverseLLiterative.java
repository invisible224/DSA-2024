// Given the head of a singly linked list, reverse the list, and return the reversed list
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

// Iterative method
class ListNode {
    int val;
    ListNode next;
   ListNode(int x) { val = x; }
}
public class ReverseLLiterative {
    public ListNode reverseList(ListNode head) {

        ListNode before = null;
        ListNode current = head;
    
        // Iterate through the list until 'current' becomes null.
        while (current != null) {
            // Store the next node temporarily, as we are about to change the link.
            ListNode nextNode = current.next;
            
            // Reverse the 'next' pointer of the current node to point to 'before'.
            current.next = before;
            
            // Move 'before' to point to the current node.
            before = current;
            
            // Move 'current' to the next node in the original list.
            current = nextNode;
        }
        return before;
    }
    
}
