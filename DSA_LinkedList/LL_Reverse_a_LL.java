package DSA_LinkedList;

public class LL_Reverse_a_LL {

    static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {

        public ListNode reverseList(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;

            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        // Create Linked List: 1 → 2 → 3 → 4
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        Solution sol = new Solution();
        ListNode reversedHead = sol.reverseList(head);

        // Print reversed list
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " → ");
            reversedHead = reversedHead.next;
        }
        System.out.println("null");
    }
}
