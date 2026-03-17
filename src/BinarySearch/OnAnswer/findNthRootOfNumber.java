package BinarySearch.OnAnswer;
import java.util.Scanner;

public class findNthRootOfNumber {

    // Computes base^exponent using long + early overflow detection
    private static long power(long base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            // Before multiplying, check if it would overflow
            if (base != 0 && result > Long.MAX_VALUE / base) {
                return Long.MAX_VALUE;  // represents "too big"
            }
            result *= base;
        }
        return result;
    }

    // Returns the largest integer x such that x^n <= m
    private static int nthRoot(int n, int m) {
        if (m == 0) return 0;
        if (m == 1) return 1;

        int left = 1;
        int right = m;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long val = power(mid, n);

            if (val == m) {
                return mid;           // exact match
            }
            if (val <= m) {           // includes overflow case → too big
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // which root (2 = sqrt, 3 = cbrt, ...)
        int m = sc.nextInt();   // number
        System.out.println(nthRoot(n, m));
    }
}