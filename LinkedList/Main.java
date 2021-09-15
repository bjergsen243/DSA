package LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList(new Node(1));
        // them
        sll.addFront(3);
        sll.addFront(5);
        sll.addLast(6);
        sll.add(4, 1);
        sll.add(2,3);
        sll.reverseList();
        sll.print();
        sc.close();
    }
}
