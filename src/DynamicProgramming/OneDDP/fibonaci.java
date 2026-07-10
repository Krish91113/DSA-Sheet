package DynamicProgramming.OneDDP;

import java.util.Scanner;

public class fibonaci {
    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
}
