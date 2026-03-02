package BinarySearch;

import java.util.Scanner;

public class searchInRotatedSortedArray {
    private static int searchInArray(int nums[], int x){
        int i=0,j=nums.length-1,ans= 0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]== x){
                ans =mid;
                return ans;
            }
            if(nums[mid]>=nums[i]){
                if(nums[mid]<= x && x < nums[i]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(nums[mid]<= x && x < nums[i]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }

        }
        return ans;7

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int x =sc.nextInt();
        System.out.println(searchInArray(nums,x));
    }
}
