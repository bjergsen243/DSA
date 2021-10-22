package LeetCodeSolved;

public class S509 {
    public int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input is invalid");
        }
        if (n <= 1) {
            return n;
        }
        int pre = 1; // n == 1
        int cur = 1; // n == 2
        for (int i = 3; i <= n; i++) {
            int next = pre + cur;
            pre = cur;
            cur = next;
        }
        return cur;
    }
}
