package StackQueue;

public class LinkedListStack implements IStackQueue {

    private class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    Node topNode;

    LinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = topNode.value;
            topNode = topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {

        return false;
    }

    @Override
    public boolean isEmpty() {

        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = topNode;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}