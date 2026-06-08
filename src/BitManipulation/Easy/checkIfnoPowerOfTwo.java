package BitManipulation.Easy;

import java.util.Scanner;

public class checkIfnoPowerOfTwo {
    public static boolean powerOFTwoOrNot(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(powerOFTwoOrNot(n));
    }
}
