/*There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order. */

// // Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]
// Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

// Definition for singly-linked list.

class ListNode {
         int val;
         ListNode next;
        ListNode(int x) { val = x; }
}
class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        // Copy the value of the next node to the current node
        node.val = node.next.val;
        // remove the pointer of that node 
        node.next = node.next.next;
    }
}
// eg. 5-3-7-9 node = 3
// copy the next value to the node (7): 5-7-7-9
// now pointer move to node.next.next : 5-7-9
