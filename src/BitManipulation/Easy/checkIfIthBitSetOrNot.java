package BitManipulation.Easy;
import java.util.*;
public class checkIfIthBitSetOrNot {
    public static boolean setOrNot(int n , int i){
        return (n & (1<<i))!=0 ;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(setOrNot(n,i));
    }
}
