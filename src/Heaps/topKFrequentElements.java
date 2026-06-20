//package Heaps;
//
//import java.util.*;
//
//// Custom Pair class to hold the element value and its frequency
//class Pair{
//    int key;
//    int val;
//    public Pair(int val,int key){
//        this.val=val;
//        this.key=key;
//    }
//}
//
//
//public class topKFrequentElements {
//    public static int[] topKFrequent(int[] nums, int k) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num: nums){
//            map.put(num, map.getOrDefault(num, 0)+1);
//        }
//
//        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> Integer.compare(a.key,b.key));
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            pq.add(new Pair(entry.getKey(), entry.getValue()));
//            if (pq.size() > k) {
//                pq.poll();
//            }
//        }
//        int ans[]=new int[k];
//        int l=0;
//        while(!pq.isEmpty()){
//            ans[l++]=pq.poll().val;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int nums[]=new int[n];
//        for(int i=0;i<n;i++){
//            nums[i]=sc.nextInt();
//        }
//        int k=sc.nextInt();
//        int ans[]=topKFrequent(nums,k);
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]);
//        }
//    }
//}
