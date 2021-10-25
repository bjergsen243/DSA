public class S747 {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int idxmax = 0;
        if (n == 1) {
            return 0;
        } else {
            
            for (int i = 1; i < n; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                    idxmax = i;
                }
            }
            for (int i = 0; i < n; i++) {
                if (max != nums[i] && (int)max/2 < nums[i]) {
                    return -1;
                }
            }
        }
        return idxmax;
    }
}
