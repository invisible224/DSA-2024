/*Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity. */

// Example
// Input: head = [2,1,3,5,6,4,7]
// Output: [2,3,6,7,1,5,4]

class ListNode {
    int val;
    ListNode next;
   ListNode(int x) { val = x; }
}
class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers for odd and even lists
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; 

        while (even != null && even.next != null) {
            // Connect odd nodes
            odd.next = even.next;
            odd = odd.next;

            // Connect even nodes
            even.next = odd.next;
            even = even.next;
        }

        // Combine the odd and even lists
        odd.next = evenHead;

        return head;
    }

}