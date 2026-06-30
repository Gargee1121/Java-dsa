class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}

public class ReverseLinkedListInKGroups {

    static ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        int count = 0;

        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count < k)
            return head;

        curr = head;
        ListNode prev = null;
        ListNode next = null;
        count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null)
            head.next = reverseKGroup(next, k);

        return prev;
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseKGroup(head, 2);

        print(head);
    }
}
