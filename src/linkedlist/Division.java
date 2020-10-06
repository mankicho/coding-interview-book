package linkedlist;

public class Division {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        Node current = linkedList.head;
        Node previous = linkedList.head;
        System.out.println(linkedList);
        int cri = 9;
        while (current != null) {
            int value = current.data;
            if (value < cri) {
                if (current == linkedList.head) {
                    previous = current;
                    current = current.next;
                    continue;
                }
                Node nextOfCurrent = current.next;
                current.next = linkedList.head;
                previous.next = nextOfCurrent;
                linkedList.head = current;

                current = nextOfCurrent;
                continue;
            }
            previous = current;
            current = current.next;
        }
        System.out.println(linkedList);
    }
}
