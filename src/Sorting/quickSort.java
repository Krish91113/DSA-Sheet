package Sorting;
import java.util.* ;
public class quickSort {
    public static int partition(int[] arr, int low, int high) {
        // Choose last element as pivot
        int pivot = arr[high];

        // Initialize i
        int i = low - 1;

        // Traverse from low to high-1
        for (int j = low; j < high; j++) {
            // If element <= pivot
            if (arr[j] <= pivot) {
                // Increment i and swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }
    public static void sortArray(int nums[], int low, int high){
        if(low<high){
            int partition = partition(nums,low,high);
            sortArray(nums,low,partition-1);
            sortArray(nums,partition+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int low=0,high=n-1;
        sortArray(nums,low,high);
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
