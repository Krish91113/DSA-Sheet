package RecursionAndBackTracking.EasyRecPs;
import java.util.*;
public class printNames {
    public static void printName(int i, int n){
        if(i>n) return;
        System.out.println("krish");
        printName(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        printName(1,n);
    }
}

