package BinarySearch;

import java.util.Scanner;

public class findMinimumInRotatedSortedArray {
    public static int findMin(int nums[]){
        int i=0,j=nums.length-1,min=Integer.MAX_VALUE;
        while(i<j){
            int mid =i +(j-i)/2;
            if(nums[mid]>nums[j]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return nums[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(findMin(nums));
    }
}
