package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        for(int i=0;i<arr.length;i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
