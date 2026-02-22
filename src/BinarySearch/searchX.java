package BinarySearch;

import java.util.Scanner;
// -1 0 3 5 9 12   t 9
//  i   m       j
public class searchX {
    private static int binarySearch(int nums[], int target){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid = i + (j -i)/2;
            if(nums[mid]== target){
                return mid;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        System.out.println(binarySearch(nums,target));
    }
}
