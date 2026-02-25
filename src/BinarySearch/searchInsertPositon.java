package BinarySearch;

import java.util.Scanner;

public class searchInsertPositon {
    private static int searchInsert(int nums[], int t){
        int i =0,j=nums.length-1;
        while(i<= j){
            int mid = i + (j-i)/2;
            if(nums[mid] == t ){
                i =mid;
                return i;
            }else if(nums[mid] < t){
                i=mid +1;
            }else{
                j=mid-1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        System.out.println(searchInsert(nums, target));
    }
}
