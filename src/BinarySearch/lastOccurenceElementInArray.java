package BinarySearch;

import java.util.Scanner;

public class lastOccurenceElementInArray {
    private static int lastOccurence(int nums[], int target){
        int i=0,j=nums.length-1,ans=0;
        while(i<=j){
            int mid = i + (j - i)/2;
            if(nums[mid]== target){
                ans=mid;
                i=mid+1;
            }else if(nums[mid]<target){
                i= mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        System.out.println(lastOccurence(nums,target));
    }
}
