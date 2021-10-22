package Graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSWithStack {
  public static void main(String[] args) {
    int[][] graph = { {0, 1, 0, 0, 0, 0, 0},
        {1,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,1},
        {0,1,0,0,0,0,1},
        {0,0,1,1,0,0,0},
        {0,0,0,1,1,0,0} };
    // Khoi tao

    // Khai bao
    Stack<Integer> stack = new Stack<>();
    Set<Integer> daDuyet = new HashSet<>();
    // Khoi tao
    stack.add(0);
    daDuyet.add(0);
    // Duyet theo stack
    while (!stack.isEmpty()) {
      int u = stack.pop();
      // xu ly u
      System.out.print(u + " ");
      // add tat ca cac dinh ke v voi u ma chua duoc add vao stack
      for (int v = 0; v < graph.length; v++) {
        if (graph[u][v] == 1 && !daDuyet.contains(v)) {
          stack.add(v);
          // danh dau da duyet v
          daDuyet.add(v);
        }
      }
    }
  }
}
