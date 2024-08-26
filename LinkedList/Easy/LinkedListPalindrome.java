/*  Given the head of a singly linked list, return true if it is a 
palindrome
or false otherwise.
*/

// Example
// Input: head = [1,2,2,1]
// Output: true

class ListNode {
    int val;
    ListNode next;
   ListNode(int x) { val = x; }
}
class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // Compare the first and second halves
        ListNode firstHalf = head;
        ListNode secondHalf = prev; 
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
