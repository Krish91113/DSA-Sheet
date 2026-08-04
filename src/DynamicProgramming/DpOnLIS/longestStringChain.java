package DynamicProgramming.DpOnLIS;
import java.util.*;

public class longestStringChain {
    public static boolean isPrecedeccor(int i, int p, String words[]){
        String curr = words[i];
        int lenCurr = curr.length();
        String prev = words[p];
        int lenPrev = prev.length();

        if(prev.length() + 1 != curr.length()) return false;

        int a = 0, b = 0;
        while(a < lenPrev && b < lenCurr){
            if(curr.charAt(b) == prev.charAt(a)){
                a++;
                b++;
            } else {
                b++;
            }
        }
        return a == prev.length();
    }

    public static int solve(int i, int p, String words[], int dp[][]){
        if(i >= words.length) return 0;
        if(dp[i][p+1]!=-1) return dp[i][p+1];
        int take = 0;
        // If p == -1 (first element) or words[i] can succeed words[p]
        if(p == -1 || isPrecedeccor(i, p, words)){
            take = 1 + solve(i + 1, i, words,dp); // Take current as the new 'p'
        }

        int ntake = solve(i + 1, p, words,dp); // Skip current, keep old 'p'

        // FIX: Use Math.max instead of addition (take + ntake)
        return dp[i][p+1]=Math.max(take, ntake);
    }

    public static int longestStrChain(String words[]){
        // FIX: Sort the array by length first so predecessor logic holds true globally
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int dp[][]=new int[words.length][words.length+1];
        for(int i=0;i< dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0, -1, words,dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        String words[] = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = sc.nextLine();
        }

        System.out.println(longestStrChain(words));
    }
}