package Arrays;

public class secondLargestElement {
    private static int secondLargest(int nums[]){
        int max =Integer.MIN_VALUE,secMax=Integer.MIN_VALUE;
        if(nums == null || nums.length<2){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
            }else if(nums[i]>secMax && nums[i]!=max){
                secMax=nums[i];
            }
        }
        return (secMax == Integer.MIN_VALUE)? -1 : secMax;
    }
    public static void main(String[] args) {
        int nums[] = {7, 7, 2, 2, 10, 10, 10};
        System.out.println(secondLargest(nums));
    }
}
