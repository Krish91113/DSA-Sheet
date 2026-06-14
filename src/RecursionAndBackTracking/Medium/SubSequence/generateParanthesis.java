package RecursionAndBackTracking.Medium.SubSequence;
import java.util.*;
public class generateParanthesis {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        List<String> ll = new ArrayList<>();
        Paranthesis(n, 0, 0, "", ll);
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
    }
    public static void Paranthesis(int n, int open, int close , String ans, List <String> ll){
        if(open ==n && close ==n){
            ll.add(ans);
            return;
        }
        if(open < n){
            Paranthesis(n, open+1, close, ans + "(", ll);
        }
        if(close < open){
            Paranthesis(n, open, close + 1, ans + ")", ll);
        }
    }
}
