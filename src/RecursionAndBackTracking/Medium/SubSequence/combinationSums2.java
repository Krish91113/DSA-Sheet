package RecursionAndBackTracking.Medium.SubSequence;
import java.util.*;
public class combinationSums2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int candidates[] = new int[n];
        for(int i=0;i<n;i++){
            candidates[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        List<List<Integer>> ans=combinationSum2(candidates,target);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans);
        }
    }
     public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
         findCombination(0,candidates,target,ds,ans);
        return ans;
    }
    public static void findCombination(int i, int[]arr,int target,List<Integer> ds,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int ind=i;ind<arr.length;ind++){
            if(ind>i && arr[ind]==arr[ind-1]) continue;
            if(arr[ind] > target) break;
            ds.add(arr[ind]);
            findCombination(ind+1,arr,target-arr[ind],ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}
