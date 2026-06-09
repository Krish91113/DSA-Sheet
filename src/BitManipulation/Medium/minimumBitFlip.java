package BitManipulation.Medium;
import java.util.*;
public class minimumBitFlip {
    public static int minBitFlips(int start, int goal){
        int c=0;
        int ans=start ^ goal;
        while(ans > 1){
            c=c+(ans&1);
            ans=ans/2;
        }
        if(ans == 1) c++;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start=sc.nextInt();
        int goal=sc.nextInt();
        System.out.println(minBitFlips(start,goal));
    }
}
