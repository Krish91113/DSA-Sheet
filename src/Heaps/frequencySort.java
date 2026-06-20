package Heaps;
import java.util.*;
class Pair{
    int key;
    int val;
    public Pair(int val,int key){
        this.val=val;
        this.key=key;
    }
}
public class frequencySort {
    public static void freqSort(int nums[], int n){
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        PriorityQueue<Pair> pq =new PriorityQueue<>((a,b) -> Integer.compare(a.key,b.key));
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        int arr[] =new int[n];
        int l=arr.length-1;
        while(!pq.isEmpty()){
            int c=0;
            while(c!=pq.peek().key){
                arr[l]=pq.peek().val;
                l--;
                c++;
            }
            pq.poll();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        freqSort(nums,n);
    }
}
