package LinkedList;

public class SinglyLinkedList {
  private Node head;
  private int size;

  SinglyLinkedList() {}

  SinglyLinkedList(Node head) {
    this.head = head;
    size++;
  }

  public Node getHead() {
    return this.head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public void addFront(int value) {
    Node node = new Node(value);
    Node currNode = head;
    if (currNode != null) {
      node.setNext(head);
      head = node;
    } else {
      head = node;
    }
    size++;
  }

  public void addLast(int value) {
    Node node = new Node(value);
    Node currNode = head;
    if (currNode == null) {
      head = node;
    } else {
      while (currNode.getNext() != null) {
        currNode = currNode.getNext();
      }
      currNode.setNext(node);
    }
    size++;
  }

  public void addAt(int value, int index) {
    if (index == 0) {
      addFront(value);
      return;
    } else if (index == size) {
      addLast(value);
      return;
    } else if (index < 0 || index > size) {
      System.out.println("Index out of bound");
      return;
    }
    Node prevNode = null;
    Node currNode = head;
    for (int i = 0; i < index; i++) {
      prevNode = currNode;
      currNode = currNode.getNext();
    }
    Node node = new Node(value);
    prevNode.setNext(node);
    node.setNext(currNode);
    size++;
  }

  public void delFront() {

    if (head == null) {
      System.out.println("Linked list is empty!");
    } else {
      head = head.getNext();
      size--;
    }
  }

  public void delLast() {
    Node currNode = head;
    Node prevNode = null;
    if (currNode == null) {
      System.out.println("Linked list is empty!");
    } else {
      while (currNode.getNext() != null) {
        prevNode = currNode;
        currNode = currNode.getNext();
      }
      if (size == 1) {
        head = head.getNext();
      } else {
        prevNode.setNext(null);
      }
      size--;
    }
  }

  public void delAt(int index) {
    if (index == 0) {
      delFront();
      return;
    } else if (index == size - 1) {
      delLast();
      return;
    } else if (index < 0 || index >= size) {
      System.out.println("Index of of bound");
      return;
    }
    Node currNode = head;
    Node prevNode = null;
    for (int i = 0; i < index; i++) {
      prevNode = currNode;
      currNode = currNode.getNext();
    }
    prevNode.setNext(currNode.getNext());
    size--;
  }

  public void reverseList() {
    Node currNode = head;
    while (currNode != null && currNode.getNext() != null) {
      Node nextNode = currNode.getNext();
      currNode.setNext(nextNode.getNext());
      nextNode.setNext(head);
      head = nextNode;
    }
  }

  public int getSize() {
    return size;
  }

  public void print() {
    Node currNode = head;
    for (int i = 0; i < size; i++) {
      System.out.print(currNode.getValue() + " ");
      currNode = currNode.getNext();
    }
  }
}
