/*Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node. */

// Example:-
// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.


class ListNode {
    int val;
    ListNode next;
   ListNode(int x) { val = x; }
}
public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

         // Traverse the list until fast reaches the end
        while (fast != null && fast.next != null) {
            // Move slow pointer one step forward
            slow = slow.next;
            // Move fast pointer two steps forward
            fast = fast.next.next;
        }

        // When the loop ends, slow will be  the middle node
        return slow;
    }
}
