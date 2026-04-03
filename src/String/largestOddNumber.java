package String;
import java.util.*;
public class largestOddNumber {
    private static String largestNumber(String s){
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i) - '0')%2!=0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(largestNumber(s));
    }
}
