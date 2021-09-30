import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Hello {

  public static int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsKey(c) == false) {
        map.put(c, 1);
      } else {
        int count = map.get(c);
        count++;
        map.put(c, count);
      }
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.get(c) == 1) {
        return i;
      }
    }
    return -1;
  }


  public static long fibo(long n) {
    if (n < 0) {
        return -1; 
    }

    long a1 = 0;
    long a2 = 1;
    if (n < 2) {
        return n;
    }

    try {
      long a = 0;
      long i = 2;
      
      while (i <= n) {
          a = Math.addExact(a1, a2);
          a1 = a2;
          a2 = a;
          i++;
      }
      return a;
    } catch (ArithmeticException e) {
        return Long.MAX_VALUE;
    }
  }
  public static int maxSubArray(int[] nums) {
    int curSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      curSum += nums[i];
      if (curSum > maxSum) {
        maxSum = curSum;
      }
      if (curSum < 0) {
        curSum = 0;
      }
    }
    return maxSum;
  }
  public static int maxSubArray2(int[] nums){
    int maxSum = nums[0];
    int curSum = maxSum;

    for (int i = 1; i < nums.length; i++) {
      curSum = Math.max(nums[i] + curSum, nums[i]);
      maxSum = Math.max(curSum, maxSum);
    }
    return maxSum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = {1,-2,5,10,11,3,-1,1};
    System.out.println(maxSubArray2(a));
    System.out.println(maxSubArray(a));
    sc.close();

  }
}
