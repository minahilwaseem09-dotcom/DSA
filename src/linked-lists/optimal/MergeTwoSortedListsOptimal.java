// Time Complexity: O(n)
// Space Complexity: O(1) — in-place merge
// Approach: Two pointers, always pick smaller node, O(1) extra space

public class MergeTwoSortedListsOptimal {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // dummy head
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1; // list1 chota hai
                list1 = list1.next;
            } else {
                curr.next = list2; // list2 chota hai
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // bacha hua attach karo
        if (list1 != null) curr.next = list1;
        if (list2 != null) curr.next = list2;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.print(result.val + " "); // 1 1 2 3 4 4
            result = result.next;
        }
    }
}