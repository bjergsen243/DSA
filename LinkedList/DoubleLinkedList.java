package LinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    DoubleLinkedList(Node head) {
        this.head = head;
        this.tail = null;
        size++;
    }

    DoubleLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
        size++;
    }

    public void addFront(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            tail = newNode;
        } else {
            head.setPrev(newNode);
        }
        newNode.setNext(head);
        head = newNode;
        size++;

    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
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
            System.out.println("Index out of bounds");
            return;
        }
        Node newNode = new Node(value);
        Node currNode = head;
        Node prevNode = null;
        for (int i = 0; i < index; i++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
        newNode.setNext(currNode);
        prevNode.setNext(newNode);
        currNode.setPrev(newNode);
        newNode.setPrev(prevNode);
        size++;

    }

    public void printNext() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.getValue() + " ");
            currNode = currNode.getNext();
        }
        System.out.println();
    }

    public void printPrev() {
        Node currNode = tail;
        while (currNode != null) {
            System.out.print(currNode.getValue() + " ");
            currNode = currNode.getPrev();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
