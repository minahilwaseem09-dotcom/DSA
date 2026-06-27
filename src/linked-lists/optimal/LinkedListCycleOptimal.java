// Time Complexity: O(n)
// Space Complexity: O(1) — no extra space
// Approach: Floyd's cycle detection — fast moves 2 steps, slow moves 1

public class LinkedListCycleOptimal {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head; // 1 step
        ListNode fast = head; // 2 steps

        while (fast != null && fast.next != null) {
            slow = slow.next;       // 1 aage
            fast = fast.next.next; // 2 aage

            if (slow == fast) return true; // mile toh cycle hai
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // cycle

        System.out.println(hasCycle(head)); // true
    }
}