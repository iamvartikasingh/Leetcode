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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode dummy = new ListNode(-1); // Dummy node
        ListNode current = dummy; // Pointer to track the merged list

        // Merge lists while both have nodes
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) { // If list1 node is smaller
                current.next = list1;
                list1 = list1.next; // Move to next node in list1
            } else { // If list2 node is smaller or equal
                current.next = list2;
                list2 = list2.next; // Move to next node in list2
            }
            current = current.next; // Move forward in merged list
        }

        // Attach remaining nodes from the non-empty list
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next; // Return the merged list (excluding dummy node)
    }
}