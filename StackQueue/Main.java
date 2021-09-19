package StackQueue;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        for (Integer integer : stack) {
            System.out.println(integer);
        }

        System.out.println("peek " + stack.peek());
        System.out.println("Pop " + stack.pop());

        System.out.println("Pop " + stack.pop());
        System.out.println("Is empty = " + stack.isEmpty());

    }
}
