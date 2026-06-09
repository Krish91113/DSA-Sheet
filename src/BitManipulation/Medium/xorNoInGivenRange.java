package BitManipulation.Medium;
import java.util.*;
public class xorNoInGivenRange {
    public static int xor(int a, int b){
        int xor =0;
        for(int i=a;i<=b;i++){
            xor =xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(xor(a,b));
    }
}
