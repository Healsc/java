import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0;i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int[] nums){
        int first = 0;
        int end = nums.length - 1;
        while(first < end){
            swap(nums,first++,end--);
        }
    }
    public static void swap(int[] nums, int first, int end){
        int temp = nums[first];
        nums[first] = nums[end];
        nums[end] = temp;
    }
}
