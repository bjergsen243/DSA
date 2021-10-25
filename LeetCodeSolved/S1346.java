public class S1346 {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            for (int j = 0; j < n; j++) {
                if (i != j && num == arr[j] * 2) {
                    return true;
                }
            }
        }
        return false;
        
    }
}
