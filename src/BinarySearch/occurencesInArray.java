package BinarySearch;

import java.util.Scanner;

public class occurencesInArray {
    private static int firstOccurence(int nums[], int x){
        int i=0,j=nums.length-1,ans=0;
        while(i<=j){
            int mid = i + (j - i)/2;
            if(nums[mid]== x){
                ans=mid;
                j=mid-1;
            }else if(nums[mid]<x){
                i= mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
    private static int lastOccurence(int nums[], int x){
        int i=0,j=nums.length-1,ans=0;
        while(i<=j){
            int mid = i + (j - i)/2;
            if(nums[mid]== x){
                ans=mid;
                i=mid+1;
            }else if(nums[mid]<x){
                i= mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
    private static int occurence(int nums[], int x){
        int f = firstOccurence(nums,x);
        int c = lastOccurence(nums,x);
        return c - f + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int x =sc.nextInt();
        System.out.println(occurence(nums,x));
    }
}
