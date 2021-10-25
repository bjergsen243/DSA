public class S1299 {
    public int[] replaceElements(int[] arr) {
        int max;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            max = arr[i+1];
            for (int j = i + 1; j < n; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[n-1] = -1;
        return arr;
    }
}
