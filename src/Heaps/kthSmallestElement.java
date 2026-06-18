package Heaps;
import java.lang.reflect.Type;
import java.util.*;
public class kthSmallestElement {
    public static int kthsmallest(int nums[], int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.remove(pq.peek());
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans = kthsmallest(nums,k);
        System.out.println(ans);
    }
}
