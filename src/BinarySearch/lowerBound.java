package BinarySearch;

import java.util.Scanner;

public class lowerBound {
    public static int lowBound(int nums[],int x){
        int lb=0,i=0,j=nums.length-1;
        while(i<=j){
            int mid = i +(j - i)/2;
            if(nums[mid]>=x){
                lb =mid;
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        return lb;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int x =sc.nextInt();
        System.out.println(lowBound(nums,x));
    }
}
