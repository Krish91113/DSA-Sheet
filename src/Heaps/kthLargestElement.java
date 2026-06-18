package Heaps;
import java.util.*;
public class kthLargestElement {
    public static void findKthLargest(int nums[],int k,int n){
        //brute force
//        int j=0;
//        Arrays.sort(nums);
//        for(int i=n-1;i>=0;i--){
//            if(i<k) break;
//            arr[j]=nums[i];
//            j++;
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
            if(pq.size()>k) {
                pq.remove(pq.peek());
            }
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        findKthLargest(nums,k,n);
    }
}
