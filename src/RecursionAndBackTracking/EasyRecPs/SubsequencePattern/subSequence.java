package RecursionAndBackTracking.EasyRecPs.SubsequencePattern;
import java.util.*;
public class subSequence {
    public static void printf(int i,ArrayList<Integer> li,int nums[], int n){
        if(i>=n){
            for(int k=0;k<li.size();k++){
                System.out.print(li.get(k) + " ");
            }
            System.out.println();
            return;
        }
        li.add(nums[i]);
        printf(i+1,li,nums,n);
        li.remove(li.size() - 1);
        printf(i+1,li,nums,n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] =new int[n];
        for(int i=0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        ArrayList<Integer> li = new ArrayList<>();
        printf(0,li,nums,n);
    }
}
