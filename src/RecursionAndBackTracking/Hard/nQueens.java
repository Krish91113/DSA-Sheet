package RecursionAndBackTracking.Hard;

import java.util.*;

public class nQueens {
    public static boolean isSafe(int row, int col, char[][] board, int n) {
        // Check left in the same row
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check lower-left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Return true if it's safe to place
        return true;
    }
    public static void solve(int col,char[][] board, List<List<String>> ans,int n){
        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                // Place queen
                board[row][col] = 'Q';
                // Recurse to next column
                solve(col + 1, board, ans, n);
                // Backtrack
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n){
        List<List<String>> ans = new ArrayList<>();
        char[][] board =new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Start backtracking from column 0
        solve(0, board, ans, n);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<List<String>> res = solveNQueens(n);
        for (List<String> board : res) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
