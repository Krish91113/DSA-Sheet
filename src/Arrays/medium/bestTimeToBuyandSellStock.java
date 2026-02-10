package Arrays.medium;

import java.util.Scanner;

public class bestTimeToBuyandSellStock {
    private static int stockBuySell(int nums[]){
        int profit =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                profit=Math.max(profit, nums[j]-nums[i]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println(stockBuySell(nums));
    }
}
