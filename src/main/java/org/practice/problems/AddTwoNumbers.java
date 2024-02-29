package org.practice.problems;

public class AddTwoNumbers {
    public static class ListNode {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newHead = new ListNode();
        int additionalValue = 0;
        while (l1.next != null || l2.next != null) {

            int sum = l1.val + l2.val;

            if(sum > 10) {
                sum -= 10 + additionalValue;
                additionalValue = 1;
            } else {
                additionalValue = 0;
            }

        }
        return newHead;

    }

    public static void main(String[] args) {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = addTwoNumbers(node1, node1);
    }


}
