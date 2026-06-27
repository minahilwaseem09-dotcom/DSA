// Time Complexity: O(n)
// Space Complexity: O(n) — extra list
// Approach: Convert to ArrayList, remove duplicates, rebuild linked list

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedListBrute {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;

        // saare values collect karo
        while (curr != null) {
            if (!list.contains(curr.val)) {
                list.add(curr.val);
            }
            curr = curr.next;
        }

        // naya linked list banao
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int val : list) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " "); // 1 2 3
            result = result.next;
        }
    }
}