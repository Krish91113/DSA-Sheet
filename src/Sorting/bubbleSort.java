package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        // The "Bubble" logic: Nested loops are required
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Corrected print loop: incrementing 'k'
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}