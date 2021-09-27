package StackQueue;

public class ArrayStack implements IStackQueue {

  private int[] array;
  private int SIZE;
  private int topIdx;

  ArrayStack(int size) {
    SIZE = size;
    array = new int[SIZE];
    topIdx = -1;
  }

  @Override
  public boolean push(int value) {
    if (!isFull()) {
      topIdx++;
      array[topIdx] = value;
      SIZE++;
      return true;
    }
    return false;
  }

  @Override
  public int pop() {
    if (!isEmpty()) {
      int val = array[topIdx];
      topIdx--;
      SIZE--;
      return val;
    }
    return -1;
  }

  @Override
  public boolean isFull() {

    return topIdx == SIZE - 1;
  }

  @Override
  public boolean isEmpty() {

    return topIdx < 0;
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.out.println("Stack is empty!");
    } else {
      for (int i = 0; i <= topIdx; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  }
}
