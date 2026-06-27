// Time Complexity: O(n)
// Space Complexity: O(1) — in-place
// Approach: Single pointer, skip duplicate nodes in-place

public class RemoveDuplicatesFromSortedListOptimal {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                // duplicate mila — skip karo
                curr.next = curr.next.next;
            } else {
                // no duplicate — aage jao
                curr = curr.next;
            }
        }
        return head;
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