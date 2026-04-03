package String;

import java.util.Scanner;

public class reverseString {

        public static String reverseWords(String s) {
            String[] word = s.trim().split(" +");
            StringBuilder res = new StringBuilder();

            for (int i = word.length - 1; i >= 0; i--) {
                res.append(word[i]);
                if (i != 0) res.append(" ");
            }

            return res.toString();
        }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(reverseWords(s));
    }
}