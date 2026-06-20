//package Heaps;
//import java.util.*;
////class Pair{
////    int key;
////    int value;
////    public Pair(int key,int value){
////        this.key=key;
////        this.value=value;
////    }
////}
//public class kClosestNumber {
//    public static void kclosest(int nums[], int n, int k, int x){
//        PriorityQueue<Pair> pq =new PriorityQueue<>((a,b) -> Integer.compare(b.key,a.key));
//        for(int i=0;i<n;i++){
//            pq.add(new Pair(Math.abs(nums[i]-x), nums[i]));
//            if(pq.size()>k){
//                pq.remove(pq.peek());
//            }
//        }
//        while(!pq.isEmpty()){
//            System.out.print(pq.poll().value + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int nums[]=new int[n];
//        for(int i=0;i<n;i++){
//            nums[i]=sc.nextInt();
//        }
//        int k=sc.nextInt();
//        int x =sc.nextInt();
//        kclosest(nums,n,k,x);
//    }
//}
