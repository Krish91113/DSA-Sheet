package BitManipulation.Easy;

import java.util.Scanner;

public class setRightmostUnsetBit {
    public static int setUnsetBit(int n){
        return n | (n+1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(setUnsetBit(n));
    }
}
