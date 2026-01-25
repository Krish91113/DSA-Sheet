package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int nums[] = {13,46,24,52,20,9};
        int mini=0;
        for(int i=0;i<nums.length-1;i++){
            mini=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[mini]){
                    mini=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[mini];
            nums[mini]=temp;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
