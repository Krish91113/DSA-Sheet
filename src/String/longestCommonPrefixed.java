package String;

import java.util.Scanner;

public class longestCommonPrefixed {


        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }

            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                // Keep shortening prefix from the end until it becomes a prefix of strs[i]
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }
            return prefix;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of strings: ");
            int n = sc.nextInt();

            // Fix for the common Scanner issue
            sc.nextLine();   // Consume the leftover newline

            String[] arr = new String[n];
            System.out.println("Enter " + n + " strings:");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLine().trim();   // trim() to remove accidental spaces
            }

            String result = longestCommonPrefix(arr);
            System.out.println("Longest Common Prefix: " + result);

            sc.close();
        }

}