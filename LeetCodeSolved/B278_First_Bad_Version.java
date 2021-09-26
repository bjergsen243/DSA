package LeetCodeSolved;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
// this class extends VersionControl
public class B278_First_Bad_Version  {
    boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid;
        while (left <= right){
            mid = left + (right-left)/2;
            if (!isBadVersion(mid)){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}