package SlidingWindow.Medium;
import java.util.*;
public class longrepeatingSubstring {
    public static int longestSubstring(String s){
        // s= a b c a b c b b
        //          i
        //              j
        // max = 3
        int i=0,j=0;
        int n=s.length();
        int maxL=Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        while(j<n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                maxL=Math.max(maxL,j-i+1);
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxL;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestSubstring(s));
    }
}
