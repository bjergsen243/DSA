package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SampleBFSWithQueue {
  public static void main(String[] args) {
    int[][] graph = {
      {0, 1, 0, 0, 0, 0, 0},
      {1, 0, 1, 1, 1, 0, 0},
      {0, 1, 0, 0, 0, 1, 0},
      {0, 1, 0, 0, 0, 1, 1},
      {0, 1, 0, 0, 0, 0, 1},
      {0, 0, 1, 1, 0, 0, 0},
      {0, 0, 0, 1, 1, 0, 0}
    };
    // Khoi tao

    // Khai bao
    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> daDuyet = new HashSet<>();
    // Khoi tao
    queue.add(0);
    daDuyet.add(0);
    // Duyet theo stack
    while (!queue.isEmpty()) {
      int u = queue.poll();
      // xu ly u
      System.out.print(u + " ");
      // add tat ca cac dinh ke v voi u ma chua duoc add vao stack
      for (int v = 0; v < graph.length; v++) {
        if (graph[u][v] == 1 && !daDuyet.contains(v)) {
          queue.add(v);
          // danh dau da duyet v
          daDuyet.add(v);
        }
      }
    }
  }
}
