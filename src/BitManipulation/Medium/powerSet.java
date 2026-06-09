package BitManipulation.Medium;

import java.util.*;

public class powerSet {
    public static List<List<Integer>> subsets(int nums[]){
        List<List<Integer>> ans =new ArrayList<>();
        int n= nums.length;
        int subset =(1<<n);
        for(int num=0;num<subset;num++){
            List<Integer> set =new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if((num & (1<<i))!= 0){
                    set.add(nums[i]);
                }
            }
            ans.add(set);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] =new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(subsets(nums));

    }
}
