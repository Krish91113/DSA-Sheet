package BinarySearch;

import java.util.Scanner;

public class searchInRotatedSortedArray2 {
    private static boolean searchInArray(int nums[], int x){
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid =i+(j-i)/2;
            if(nums[mid] == x){
                return true;
            }
            if(nums[i]==nums[mid] && nums[mid] == nums[j]){
                i++;
                j--;
                continue;
            }
            if(nums[i]<= nums[mid]){
                if(nums[i]<= x && x <= nums[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(nums[mid]<= x && x<= nums[j]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }
        return false;
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
