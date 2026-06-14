package RecursionAndBackTracking.EasyRecPs.SubsequencePattern;

import java.util.ArrayList;
import java.util.Scanner;
// printing all subsequences
public class subsequenceWhoseSumEqualsKPrintingPattern {
    public static void printf(int i,ArrayList<Integer> li,int nums[], int n, int sum, int k){
        if(i>=n){
            if(sum == k){
                for(int l=0;l<li.size();l++){
                    System.out.print(li.get(l) + " ");
                }
                System.out.println();
            }
            return;
        }
        li.add(nums[i]);
        sum+=nums[i];
        printf(i+1,li,nums,n,sum,k);
        li.remove(li.size() - 1);
        sum-=nums[i];
        printf(i+1,li,nums,n,sum,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int sum =0;
        int k=sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        printf(0, li, nums, n,sum,k);
    }
}
