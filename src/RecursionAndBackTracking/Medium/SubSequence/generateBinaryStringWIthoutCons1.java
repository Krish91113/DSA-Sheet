package RecursionAndBackTracking.Medium.SubSequence;
import java.util.*;
public class generateBinaryStringWIthoutCons1 {
    public static void generateBinaryStrings(int n, int i, List<Integer> li,List<List<Integer>> ans){
        //base conditon
        if(i == n){
            for(int k=1;k<li.size();k++){
                if(li.get(k) == 1 && li.get(k-1) == 1) return;
            }
            ans.add(new ArrayList<>(li));
            return;
        }
        //add element in list
        li.add(0);
        generateBinaryStrings(n,i+1,li,ans);

        // remove element and then add 1
        li.remove(li.size()-1);
        li.add(1);
        generateBinaryStrings(n,i+1,li,ans);
        li.remove(li.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        List<Integer> li =new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        generateBinaryStrings(n,0,li,ans);
        System.out.println("Valid Binary Strings:");
        for (List<Integer> string : ans) {
            System.out.println(string);
        }
    }
}
