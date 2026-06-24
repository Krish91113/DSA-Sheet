package Heaps;
import java.util.*;
public class maxIceCreamBarss {
    public static int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;

        for (int cost : costs) {
            sum += cost;
            maxHeap.offer(cost);

            if (sum > coins) {
                sum -= maxHeap.poll();
            }
        }

        return maxHeap.size();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int nums[] =new int[n];
        for(int i= 0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        int c =sc.nextInt();
        System.out.println(maxIceCream(nums,c));
    }
}
