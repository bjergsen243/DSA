package LinkedList;

public class Main {
  public static void main(String[] args) {
    DoubleLinkedList dll = new DoubleLinkedList();
    dll.addLast(2);
    dll.addFront(5);
    dll.addFront(3);
    dll.addAt(4, 3);
    dll.printNext();
    // them

  }
}
