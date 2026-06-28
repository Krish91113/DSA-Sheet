package Greedy.Medium;
import java.util.*;
public class lemonadeExchange {
    public static boolean lemonadeChange(int [] bills){
        int c5=0,c10=0,c20=0;
        for(int num:bills){
            if(num == 5) c5++;
            else if(num == 10){
                if(c5!=0){
                    c5--;
                    c10++;
                }else{
                    return false;
                }
            }
            else if(num == 20){
                if(c10!=0 && c5!=0){
                    c10--;
                    c5--;
                    c20++;
                }else if(c5 >= 3) {
                    c5 =c5-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] =new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(lemonadeChange(nums));
    }
}
