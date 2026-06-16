package RecursionAndBackTracking.Medium.SubSequence;

import java.util.*;

public class subset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> ds=new ArrayList<>();
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> set = new ArrayList<>();
        subsetWithDup(0,nums,n,set,ans);
        ds.addAll(ans);
        for (List<Integer> subset : ds) {
            System.out.println(subset);
        }
    }
    public static void subsetWithDup(int i,int nums[], int n, List<Integer> set,HashSet<List<Integer>> ans ){
        if(i>=n){
            ans.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[i]);
        subsetWithDup(i+1,nums,n,set,ans);
        set.remove(set.size()-1);
        subsetWithDup(i+1,nums,n,set,ans);
    }
}
