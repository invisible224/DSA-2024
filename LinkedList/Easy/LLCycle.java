/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
 */

//  Example
// Input: head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).


class ListNode {
    int val;
    ListNode next;
   ListNode(int x) { val = x; }
}
public class LLCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast = head;

        while(fast!=null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;

            //if fast and slow pointer meets then it means LL has loop
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
