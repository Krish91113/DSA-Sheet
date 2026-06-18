package Heaps;

import java.util.Scanner;
import java.util.*;
public class sortKSortedArray {
    public static void ksortedarray(int nums[], int k,int n){
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        List<Integer> li=new ArrayList<>();
        for(int i=k;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                int top=pq.peek();
                pq.remove(pq.peek());
                li.add(top);
            }
        }
        while(!pq.isEmpty()){
            int top=pq.peek();
            pq.remove(pq.peek());
            li.add(top);
        }
        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        ksortedarray(nums,k,n);
    }
}
