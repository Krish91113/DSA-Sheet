package Arrays.hard;

import java.util.Scanner;

public class reversePairs {
        public static int reversePair(int[] nums) {
            return mergeSort(nums,0,nums.length-1);
        }
        private static int mergeSort(int nums[], int low,int high){
            if(low>=high) return 0;
            int mid= low + (high-low)/2;
            int c=0;
            c+=mergeSort(nums,low,mid);
            c+=mergeSort(nums,mid+1,high);
            c+=mergeAndCount(nums,low,mid,high);
            return c;
        }
        private static int mergeAndCount(int nums[],int low,int mid,int high){
            int temp[] = new int[high-low+1];
            int left = low,right=mid+1,k=0,count=0;
            int j = mid + 1;
            for (int i = low; i <= mid; i++) {
                while (j <= high && (long) nums[i] > 2L * nums[j]) {
                    j++;
                }
                count += (j - (mid + 1));
            }
            left = low;
            right = mid + 1;
            while (left <= mid && right <= high) {
                if (nums[left] <= nums[right]) {
                    temp[k++] = nums[left++];
                } else {
                    temp[k++] = nums[right++];
                }
            }

            while (left <= mid) {
                temp[k++] = nums[left++];
            }
            while (right <= high) {
                temp[k++] = nums[right++];
            }


            for (int i = low; i <= high; i++) {
                nums[i] = temp[i - low];
            }
            return count;
        }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println(reversePair(nums));
    }
}
