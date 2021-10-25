

public class B88_Merge_Sorted_Array {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = nums1.length - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] >= nums2[j]) {
        nums1[k] = nums1[i];
        i--;
        k--;
      } else {
        nums1[k] = nums2[j];
        j--;
        k--;
      }
    }
    while (i >= 0) {
      nums1[k] = nums1[i];
      i--;
      k--;
    }
    while (j >= 0) {
      nums1[k] = nums2[j];
      j--;
      k--;
    }
  }
}
