package String;

import java.util.Scanner;

public class romanToInteger {
    private static int romanToInt(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = getValue(s.charAt(i));
            int next = (i + 1 < n) ? getValue(s.charAt(i + 1)) : 0;

            if (current < next) {
                ans -= current;
            } else {
                ans += current;
            }
        }
        return ans;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(romanToInt(s));
    }
}
