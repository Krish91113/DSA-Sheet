package DynamicProgramming.DpOnLIS;
import java.util.*;
public class largestDivisbleSubset {
    static List<Integer>[][] dp;
    public static List<Integer> solve(int i, int p, int nums[]){
        if(i>=nums.length) return new ArrayList<>();

        if(dp[i][p + 1] != null)
            return dp[i][p + 1];
        List<Integer> take =new ArrayList<>();
        if(p==-1 || nums[p]%nums[i]==0 || nums[i]%nums[p]==0){
            take = new ArrayList<>(solve(i+1,i,nums));
            take.add(0,nums[i]);
        }
        List<Integer> skip =solve(i+1,p,nums);
        if (take.size() > skip.size()) {
            dp[i][p + 1] = take;
        } else {
            dp[i][p + 1] = skip;
        }
        return dp[i][p + 1];
    }
    public static List<Integer> lds(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        dp = new ArrayList[n][n + 1];
        return solve(0,-1,nums);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = lds(nums);
        System.out.println("Longest Increasing Subsequence: " + result);
    }
}
