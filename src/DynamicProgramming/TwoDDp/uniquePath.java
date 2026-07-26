package DynamicProgramming.TwoDDp;
import java.util.*;
public class uniquePath {
        public static int solve(int i, int j, int[][] dp, int m, int n) {
            if (i == m - 1 && j == n - 1) return 1;
            if (i >= m || j >= n) return 0;
            if (dp[i][j] != -1) return dp[i][j];

            int right = solve(i, j + 1, dp, m, n);
            int down = solve(i + 1, j, dp, m, n);

            return dp[i][j] = right + down;
        }
        public static int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }
            return solve(0, 0, dp, m, n);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(uniquePaths(m,n));
    }
}

