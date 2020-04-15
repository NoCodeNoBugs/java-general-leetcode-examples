package leetcode;

import java.util.List;

public class ListHasCycleTwoPointers {

    public boolean hasCycle(ListNode head){

        ListNode fast = head.next;
        ListNode slow = head;

        if(head == null) return  false;

        while (fast.next != null && fast != null){

            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return  false;
    }
}
