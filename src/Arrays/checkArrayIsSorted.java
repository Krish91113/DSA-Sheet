package Arrays;
import java.util.*;
public class checkArrayIsSorted {
    private static boolean checkArraySort(int nums[]){
        int i=1;
        while(i<nums.length){
            if(nums[i]>nums[i-1]){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(checkArraySort(nums));
    }
}
