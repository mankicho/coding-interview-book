package linkedlist;


import java.util.HashMap;

public class DuplicationRemoval {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();


        System.out.println(linkedList);

        System.out.println("head remove!!");
        linkedList.remove(5);
        System.out.println(linkedList);

        System.out.println("some node remove!!");
        linkedList.remove(27);
        System.out.println(linkedList);

        System.out.println("distinct !!");
        distinctUsingNoBuffer(linkedList);
        System.out.println(linkedList);
    }

    static public void distinctUsingHashMap(LinkedList linkedList) {
        Node head = linkedList.head;

        if (head.next == null) {
            return;
        }

        HashMap<Integer, Node> map = new HashMap<>();
        Node tmp = head;

        Node previous = tmp;
        while (tmp != null) {
            if (map.get(tmp.data) == null) {
                map.put(tmp.data, tmp);
                previous = tmp;
                tmp = tmp.next;
            } else {
                map.put(tmp.data, tmp);

                if (tmp.next != null) {
                    previous.next = tmp.next;
                    tmp = tmp.next;
                } else {
                    previous.next = null;
                }
            }
        }
    }

    static public void distinctUsingNoBuffer(LinkedList linkedList) {
        Node head = linkedList.head;
        if (head.next == null) {
            return;
        }
        Node current = head;

        while (current != null) {
            Node runner = current.next;
            Node previousRunner = current;
            while (runner != null) {
                if (runner.data == current.data) {
                    if (runner.next == null) {
                        previousRunner.next = null;
                        break;
                    } else {
                        previousRunner.next = runner.next;
                        runner = runner.next;
                        continue;
                    }

                }

                previousRunner = runner;
                runner = runner.next;
            }
            current = current.next;
        }
    }
}