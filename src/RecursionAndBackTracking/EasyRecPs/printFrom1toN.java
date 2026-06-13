package RecursionAndBackTracking.EasyRecPs;

import java.util.Scanner;

public class printFrom1toN {
    public static void printNo(int i, int n){
        if(i>n) return;
        System.out.print(i + " ");
        printNo(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        printNo(1,n);
    }
}
