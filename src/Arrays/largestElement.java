package Arrays;

public class largestElement {
    public static int largest (int [] arr){
        int big=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            big=Math.max(arr[i],big);
        }
        return big;
    }
    public static void main(String[] args) {
        int arr[] = {12,45,15,29,75};
        System.out.println(largest(arr));
    }
}
