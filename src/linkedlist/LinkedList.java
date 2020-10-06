package linkedlist;

import java.util.HashMap;

public class LinkedList {
    Node head;

    {
        addNode(5);
        addNode(1);
        addNode(9);
        addNode(15);
        addNode(33);
        addNode(33);
        addNode(33);
        addNode(27);
        addNode(32);
        addNode(16);
        addNode(16);
        addNode(16);
        addNode(16);
        addNode(1);
        addNode(1);
        addNode(1);
        addNode(1);
        addNode(73);
    }

    public LinkedList() {

    }


    public void remove(int d) {
        Node n = new Node(d);
        Node tmp = head;
        if (tmp.data == n.data) {
            head = head.next;
            return;
        }
        Node previous = null;
        while (tmp != null) {

            if (tmp.data == n.data) {
                previous.next = tmp.next;
                return;
            }

            previous = tmp;
            tmp = tmp.next;
        }
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void addNode(int a) {
        Node node = new Node(a);
        if (head == null) {
            head = node;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = node;
    }

    public String toString() {
        Node tmp = head;
        StringBuilder sb = new StringBuilder();
        while (tmp != null) {
            sb.append(tmp.data).append(" ");
            tmp = tmp.next;

        }
        return sb.toString();
    }
}
