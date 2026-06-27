// Time Complexity: O(n)
// Space Complexity: O(n) — HashSet
// Approach: Store visited nodes in HashSet, cycle if node seen again

import java.util.HashSet;

public class LinkedListCycleBrute {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {
            if (visited.contains(curr)) return true; // cycle!
            visited.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        // cycle wala list: 1→2→3→4→2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // cycle back to 2

        System.out.println(hasCycle(head)); // true
    }
}