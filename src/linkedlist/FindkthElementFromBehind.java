package linkedlist;

import java.util.Scanner;

public class FindkthElementFromBehind {
    public static void main(String[] args) {
        while (true) {

            LinkedList linkedList = new LinkedList();
            System.out.println(linkedList);
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();

            Node current = linkedList.head;
            Node runner = linkedList.head;

            for (int i = 0; i < k; i++) {
                runner = runner.next;
            }

            while (runner != null) {
                current = current.next;
                runner = runner.next;
            }

            System.out.println("뒤에서 k 번째 값은 = " + current.data);
        }
    }
}
