package Recursion.Easy;
import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        swap(nums,0,n-1);
        int i=0;
        reverse(nums,0);
    }
    public static void swap(int [] nums, int l,int r){
        if(l>=r) return;
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        swap(nums,l+1,r-1);
    }
    public static void reverse(int nums[], int i){
        if(i>=nums.length) return;
        System.out.print(nums[i]);
        reverse(nums,i+1);
    }
}
