package Recursion.Easy;

import java.util.Scanner;

public class checkPalindromeString {
    static boolean isFound=false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        checkPalindrome(s,0,s.length()-1);
        System.out.println(isFound);
    }
    public static void checkPalindrome(String s, int i, int j){
        if(i>=j) {
            isFound = true;
            return;
        }
        if(s.charAt(i)!=s.charAt(j)) return;
        checkPalindrome(s,i+1,j-1);
    }
}
