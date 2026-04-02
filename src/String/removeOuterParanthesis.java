package String;

import java.util.Scanner;

public class removeOuterParanthesis {
    public static String removeOuterParentheses(String s) {
        int depth =0;
        StringBuilder result = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(depth > 0) result.append(ch);
                depth++;
            }else{
                depth--;
                if(depth > 0) result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(removeOuterParentheses(s));
    }
}
