import java.util.HashMap;

class Node {
    int data;
    Node next, random;

    Node(int data) {
        this.data = data;
    }
}

public class CopyListWithRandomPointer {

    static Node copyRandomList(Node head) {

        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;

        while (curr != null) {
            map.put(curr, new Node(curr.data));
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);

        head.random = head.next;
        head.next.random = head;

        Node copied = copyRandomList(head);

        System.out.println("Copied Head: " + copied.data);
    }
}
