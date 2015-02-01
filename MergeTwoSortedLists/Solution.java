
// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                p.next = new ListNode(p1.val);
                p1 = p1.next;
            } else {
                p.next = new ListNode(p2.val);
                p2 = p2.next;
            }

            p = p.next;
        }

        if(p1 != null) {
            p.next = p1;
        }

        if(p2 != null) {
            p.next = p2;
        }

        return dummy.next;
    }
}