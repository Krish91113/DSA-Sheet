package Greedy.Easy;
import java.util.*;
public class assignCookies {
    public static int findContentChildren(int []s,int [] g){
        int i=0,j=0;
        int ans =0;
        Arrays.sort(s);
        Arrays.sort(g);
        while(j<s.length && i<g.length){
            if(s[j]>=g[i]){
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int g=sc.nextInt();
        int stu[]=new int[s];
        int greed[]=new int[g];
        for(int i=0;i<s;i++){
            stu[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            greed[i]=sc.nextInt();
        }
        System.out.println(findContentChildren(stu,greed));
    }
}
