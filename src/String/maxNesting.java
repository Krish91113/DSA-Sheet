package String;

import java.util.Scanner;

public class maxNesting {
    public static int maxDepth(String s) {
        int c=0,max=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                c++;
                max=Math.max(max,c);
            }
            if(ch == ')'){
                c--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(maxDepth(s));
    }
}
