package Arrays.hard;
import java.util.*;
public class findMissingAndRepeatedValue {
        public static int[] findMissingAndRepeatedValues(int[][] grid) {
            int[] temp = new int[2];
            int c=0,dup=0,sum=0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    c++;
                    sum+=grid[i][j];
                    if(map.containsKey(grid[i][j])){
                        dup=grid[i][j];
                    }
                    map.put(grid[i][j],1);
                }
            }
            temp[0] = dup;
            int t = c * (c + 1) / 2;
            temp[1] = (t-sum) + dup;
            return temp;
        }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int m=sc.nextInt();
        int nums[][] = new int[n][m];
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] =nums[i][j];
            }
        }
        System.out.println(findMissingAndRepeatedValues(nums));
    }
}
