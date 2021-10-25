import java.util.Arrays;

public class S1051 {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];
        for (int i = 0; i < n; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int dif = 0;
        for (int i = 0; i < n; i++) {
            if (expected[i] != heights[i]) {
                dif++;
            }
        }
        return dif;
     }
}
