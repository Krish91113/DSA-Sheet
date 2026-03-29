package Arrays.hard;
import java.util.*;
public class mergeIntevals {
    class Solution {
        public static int[][] merge(int[][] intervals) {
            if (intervals.length == 0) {
                return new int[0][0];
            }

            // Step 1: Sort by start time
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            List<int[]> merged = new ArrayList<>();

            // Pehla interval ko copy karke add karo (safe way)
            merged.add(new int[]{intervals[0][0], intervals[0][1]});

            for (int i = 1; i < intervals.length; i++) {
                int[] current = merged.get(merged.size() - 1);
                int[] next = intervals[i];

                if (next[0] <= current[1]) {        // overlap condition
                    current[1] = Math.max(current[1], next[1]);
                }
                else {
                    merged.add(new int[]{next[0], next[1]});   // safe copy
                }
            }

            // Convert List to 2D array
            return merged.toArray(new int[merged.size()][]);
        }
    }
    public static void main(String[] args) {

    }
}
