package LeetCodeSolved;

import java.util.Map;
import java.util.HashMap;

public class B167_Two_Sum_II {
  public int[] twoSum(int[] numbers, int target) {
    int[] res = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(target - numbers[i])) {
        res[1] = i + 1;
        res[0] = map.get(target - numbers[i]) + 1;
        return res;
      } else {
        map.put(numbers[i], i);
      }
    }
    return res;
  }
}
