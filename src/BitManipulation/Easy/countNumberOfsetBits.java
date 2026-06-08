package BitManipulation.Easy;

import java.util.Scanner;

public class countNumberOfsetBits {
    public static int countBits(int n){
        int c=0;
        while(n>1){
             c+= n & 1;
            n/=2;
        }
        if(n==1) c++;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countBits(n));
    }
}
