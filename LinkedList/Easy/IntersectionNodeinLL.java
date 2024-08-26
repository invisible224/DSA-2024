/* Intersection of Two Linked Lists 
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null. */

// Example
/*Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8' */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
// Optimal solution
public class IntersectionNodeinLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            // Move pointer a, or switch to headB if at the end
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            // Move pointer b, or switch to headA if at the end
            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        // Return the intersection node or null if there is no intersection
        return a;
    }
}

// My brute force one
/*public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Step 1: Use a HashMap to store nodes of the first list
        HashMap<ListNode, Boolean> map = new HashMap<>();
        ListNode temp = headA;
        
        while (temp != null) {
            map.put(temp, true);
            temp = temp.next;
        }
        
        // Step 2: Traverse the second list and check for intersection
        temp = headB;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return temp;  // Intersection found
            }
            temp = temp.next;
        }
        
        return null;  // No intersection
    }
} */