
import java.util.HashMap;
import java.util.Map;

public class Hello {
    public class Node {
        public Node next;
        public int value;
        // them constructor o day
    }

    public static class SinglyLinkedList {
        public Node head;

        // them o cuoi danh sach
        public void enqueue(Node node) {
            Node currNode = head;
            if (currNode == null) {
                head = node;
            } else {
                while (currNode.next != null) {
                    currNode = currNode.next;
                }
                currNode.next = node;
            }
        }

        public int dequeue() {
            Node currNode = head;
            int val = 0;
            if (currNode == null) {
                System.out.println("Linked list is empty!");
            } else {
                val = head.value;
                head = head.next;
            }
            return val;
        }

        public void push(Node node) {
            Node currNode = head;
            if (currNode == null) {
                head = node;
            } else {
                node.next = head;
            }
        }

        public int pop() {
            Node currNode = head;
            Node prevNode = null;
            int val = 0;
            if (currNode == null) {
                System.out.println("Linked list is empty!");
            } else {
                val = currNode.value;
                while (currNode != null) {
                    prevNode = prevNode.next;
                    currNode = currNode.next;
                }
                prevNode.next = null;
            }
            return val;
        }
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) == false) {
                map.put(c, 1);
            } else {
                int count = map.get(c);
                count++;
                map.put(c, count);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
