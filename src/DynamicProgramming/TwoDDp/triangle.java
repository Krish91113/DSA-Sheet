package DynamicProgramming.TwoDDp;
import java.util.*;
public class triangle {
//    public static int solve(int i, int j, ArrayList<ArrayList<Integer>> triangle, int dp[][]){
//        int n=triangle.size();
//        if(i==n-1) return triangle.get(i).get(j);
//        if(dp[i][j]!=-1) return dp[i][j];
//        int down = triangle.get(i).get(j)
//                + solve(i + 1, j, triangle,dp);
//
//        int diagonal = triangle.get(i).get(j)
//                + solve(i + 1, j + 1, triangle,dp);
//
//        return dp[i][j]=Math.min(down, diagonal);
//    }
public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {

    int n = triangle.size();
    int[][] dp = new int[n][n];

    // Base case: last row
    for (int j = 0; j < n; j++) {
        dp[n-1][j] = triangle.get(n-1).get(j);
    }

    for (int i = n - 2; i >= 0; i--) {
        for (int j = i; j >= 0; j--) {

            int d = triangle.get(i).get(j) + dp[i+1][j];

            int dg = triangle.get(i).get(j) + dp[i+1][j+1];

            dp[i][j] = Math.min(d, dg);
        }
    }

    return dp[0][0];
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                row.add(sc.nextInt());
            }

            triangle.add(row);
        }

        System.out.println(minimumTotal(triangle));
    }
}
