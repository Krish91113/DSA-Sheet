package Arrays.medium;
import java.util.*;
public class sortZeroOneandTw0 {
    private static void sortArray(int nums[]){
        // 0 0 2 1 1
        //     i
        //     k
        int i =0;
        for(int j =0;j<nums.length;j++){
            if(nums[j] == 0){
                int temp =nums[i];
                nums[i] =nums[j];
                nums[j] =temp;
                i++;
            }
        }
        i=0;
        for(int k =0;k<nums.length;){
            while(nums[i] == 2 && i<nums.length && k<nums.length){
                if(nums[k] ==1){
                    int temp =nums[i];
                    nums[i] =nums[k];
                    nums[k] =temp;
                    i++;
                }else{
                    k++;
                }
            }
            i++;
            k++;
        }
        for(int l =0;l<nums.length;l++){
            System.out.print(nums[l] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] =sc.nextInt();
        }
        sortArray(nums);
    }
}
