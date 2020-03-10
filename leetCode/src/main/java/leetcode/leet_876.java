package leetcode;

public class leet_876 {

    /*
     Definition for singly-linked list. public class ListNode { int val;
      ListNode next; ListNode(int x) { val = x; } }
     */
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        ListNode start = head;
        int len = 0;

        while (node != null) {
            node = node.next;
            len++;
        }

        len /= 2;

        while (len > 0) {
            start = start.next;
            len--;
        }
        return start;

    }

    public static void main(String[] args) {

    }

}
