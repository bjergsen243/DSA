package LinkedList;

public class Node {
    private Node next;
    private int value;

    Node() {
    }

    Node(int value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
