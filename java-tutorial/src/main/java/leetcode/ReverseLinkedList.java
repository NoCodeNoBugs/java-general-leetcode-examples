package leetcode;


/* Reverse Linked List */
/* Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL */

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {


        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while (current!= null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;


        }
        return prev;
    }
}
