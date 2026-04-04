package String;
import java.util.*;
public class rotateStringLc {
    private static String rotate(String s){
        char temp = s.charAt(0);
        String ans="";
        for(int i=1;i<s.length();i++){
            ans = ans + s.charAt(i);
        }
        ans= ans + temp;
        return ans;
    }
    public static boolean rotateString(String s, String goal) {
        String t=s;
        for(int i=0;i<s.length();i++){
            t = rotate(t);
            if(t.equals(goal)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        String goal =sc.nextLine();
        System.out.println(rotateString(s,goal));
    }
}
