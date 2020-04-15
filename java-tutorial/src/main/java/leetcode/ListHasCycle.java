package leetcode;


/* Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to.
If pos is -1, then there is no cycle in the linked list.*/

import java.util.HashSet;

public class ListHasCycle {

    public boolean hasCycle(ListNode head){

        HashSet<ListNode> set = new HashSet<>();

        ListNode current = head;
        if(head == null){
            return false;
        }

        while (current!=null) {
            if (set.contains(current)) {
                return true;

            } else {

                set.add(current);
                current = current.next;
            }
        }
        return false;
    }
}
