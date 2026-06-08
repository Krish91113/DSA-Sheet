package BitManipulation.Easy;

import java.util.Scanner;

public class checkNoOddOrNot {
    public static boolean oddOrNot(int n){
        return (n&1)!=0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(oddOrNot(n));
    }
}
