
public class Main {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (i != minIdx) {
                // int temp = arr[i];
                // arr[i] = arr[minIdx];
                // arr[minIdx] = temp;
                swap(arr[i], arr[minIdx]);
            }
        }
    }
    public static void bubble_Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,7,4,78,12,45};
        //selectionSort(arr);
        bubble_Sort(arr);
        printArray(arr);
    }
}