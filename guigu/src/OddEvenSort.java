import java.util.Arrays;

public class OddEvenSort {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        oddEvenSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void oddEvenSort(int[] nums){
        int first = 0, second = nums.length - 1;
        while(first < second){
            while(first < second && nums[first] % 2 == 1){
                first++;
            }
            while(first < second && nums[second] % 2 ==0){
                second--;
            }
            if(first < second){
                swap(nums,first,second);
            }
        }
    }
    public static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
