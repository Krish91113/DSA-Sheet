package RecursionAndBackTracking.Medium.SubSequence;

import java.util.*;

public class combinationSums {
    public static void findCombination(int i,int [] arr,int target,List<List<Integer>> ans, List<Integer> ds ){
        if(i == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i]<= target){
            ds.add(arr[i]);
            findCombination(i,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(i+1,arr,target,ans,ds);
    }
    public static List<List<Integer>> combinationSum(int candidates[], int target){
        List<List<Integer>> ans =new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int target =sc.nextInt();
        int n =sc.nextInt();
        int candidates[] =new int[n];
        for(int i=0;i<n;i++){
            candidates[i]=sc.nextInt();
        }
        combinationSum(candidates,target);

    }
}
