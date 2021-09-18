package StackQueue;

public class ArrayQueue implements IStackQueue{

    private int[] array;
    private int SIZE;
    private int headIdx;
    private int tailIdx;

    ArrayQueue(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIdx = tailIdx = -1;
    }


    @Override
    public boolean push(int value) {
        if (!isFull()){
            if (isEmpty()){
                headIdx++;
            }
            tailIdx++;
            array[tailIdx] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = array[headIdx]; 
            headIdx++;
            if (headIdx > tailIdx) {
                headIdx = tailIdx = -1;
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        
        return tailIdx == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        
        return (headIdx == -1) && (tailIdx == -1);
    }

    @Override
    public void show() {
        if (!isEmpty()) {
            for (int i = headIdx; i <= tailIdx; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
        
    }
    
    public int count() {
        if (isEmpty()) {
            return 0;
        }
        return tailIdx - headIdx + 1;
    }
}
