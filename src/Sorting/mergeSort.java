package Sorting;

import java.util.*;

public class mergeSort {
    public static void merge(int nums[], int l, int r, int mid){
        int leftLen=mid-l+1;
        int rightLen=r-mid;
        int left[]=new int[leftLen];
        int right[]=new int[rightLen];
        int k=0;
        for(int i=0;i<leftLen;i++){
            left[i]=nums[k];
            k++;
        }
        k=mid+1;
        for(int j=0;j<rightLen;j++){
            right[j]=nums[k];
            k++;
        }

        int i=0,j=0,m=0;
        while(i<leftLen && j<rightLen){
            if(left[i]<right[j]){
                nums[m]=left[i];
                i++;
            }else {
                nums[m]=right[j];
                j++;
            }
            m++;
        }
        while(i<leftLen){
            nums[m]=left[i];
            i++;
            m++;
        }
        while(j<rightLen){
            nums[m]=right[j];
            j++;
            m++;
        }
    }
    public static void mergeSorts(int nums[], int l, int r){
        if(l>=r) return ;
        int mid = l+r/2;
        mergeSorts(nums,l,mid-1);
        mergeSorts(nums,mid+1,r);
        merge(nums,l,r,mid);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int low=0,high=n-1;
        mergeSorts(nums,low,high);
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
