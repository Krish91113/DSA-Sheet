package Arrays.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //numRow=5
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        for(int row=1;row< numRows;row++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            List<Integer> prevRow= result.get(row-1);
            for(int i=1;i<row;i++){
                newRow.add(prevRow.get(i-1)+prevRow.get(i));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(generate(n));
    }
}
