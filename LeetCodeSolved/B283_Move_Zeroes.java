

public class B283_Move_Zeroes {
  public void moveZeroes(int[] nums) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[k] = nums[i];
        k++;
      }
    }
    for (int i = k; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
