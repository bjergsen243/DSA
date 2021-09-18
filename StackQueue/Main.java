package StackQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.show();

        queue.pop();
        queue.show();

        queue.pop();
        queue.show();

        queue.pop();
        queue.show();

        queue.pop();
        queue.show();

        
    }
}
