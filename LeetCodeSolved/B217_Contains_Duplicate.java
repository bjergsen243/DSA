

import java.util.Set;
import java.util.HashSet;

public class B217_Contains_Duplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num) == true) {
        return true;
      } else {
        set.add(num);
      }
    }
    return false;
  }
}
