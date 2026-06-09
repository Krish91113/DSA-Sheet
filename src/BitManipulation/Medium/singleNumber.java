package BitManipulation.Medium;
import java.util.*;
public class singleNumber {
    public static int singleNo(int nums[]){
        int xor=0;
        for(int i= 0;i<nums.length;i++){
            xor =xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] =new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(singleNo(nums));
    }
}
