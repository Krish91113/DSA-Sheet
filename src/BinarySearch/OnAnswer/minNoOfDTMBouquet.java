package BinarySearch.OnAnswer;

import java.util.Scanner;

public class minNoOfDTMBouquet {
    private static boolean canMake(int[] bloomDay,int m,int k,int days){
        int c=0,b=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=days){
                c++;
                if(c==k){
                    b++;
                    c=0;
                }
            }
            else {
                c=0;
            }
        }
        return b>=m;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int ans = -1;
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int min= Integer.MAX_VALUE,max= Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min= Math.min(min,bloomDay[i]);
            max= Math.max(max,bloomDay[i]);
        }
        int l=min,h=max;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(canMake(bloomDay,m,k,mid)){
                ans = mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int bloomDay[]=new int[n];
        for(int i=0;i<n;i++){
            bloomDay[i]=sc.nextInt();
        }
        int m= sc.nextInt();
        int k=sc.nextInt();
        System.out.println(minDays(bloomDay,m,k));
    }
}
