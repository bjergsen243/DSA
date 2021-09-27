package LeetCodeSolved;

import java.util.Map;
import java.util.HashMap;

public class B1_Two_Sum {
  public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        res[0] = i;
        res[1] = map.get(target - nums[i]);
      } else {
        map.put(nums[i], i);
      }
    }
    return res;
  }
}
