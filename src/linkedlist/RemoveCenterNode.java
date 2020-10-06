package linkedlist;

public class RemoveCenterNode {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node n = linkedList.head;

        System.out.println(linkedList);

        System.out.println("after removing center node !!");
        int removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
        System.out.println("after removing center node !!");
        removeValue = removeCenterNode(n);
        System.out.println(linkedList + " ==> remove node is " + removeValue);
    }

    static int removeCenterNode(Node head) {
        Node current = head;
        Node runner = head;

        Node previous = head;

        if (current.next == null || current.next.next == null) {
            System.out.println("list has no center Node. list.size is 1 or 2");
            return -1;
        }

        while (runner != null && runner.next != null) {
            previous = current;
            runner = runner.next.next;
            current = current.next;
        }

        int value = current.data;
        previous.next = current.next;
        return value;
    }
}
