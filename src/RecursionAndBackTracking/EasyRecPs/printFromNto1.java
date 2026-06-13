package RecursionAndBackTracking.EasyRecPs;

import java.util.Scanner;

public class printFromNto1 {
    public static void printNo(int n,int i){
        if(n<i) return;
        System.out.print(n + " ");
        printNo(n-1,1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        printNo(n,1);
    }
}
