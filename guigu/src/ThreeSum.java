import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0;i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target = input.nextInt();
        System.out.println(target);
        System.out.println(Arrays.toString(threeSum(arr,target)));
    }
    public static int[] threeSum(int[] nums,int target){
        int[] result = new int[3];
        if(nums.length < 3){
            return nums;
        }
        Arrays.sort(nums);
        for(int i = 0 ;i < nums.length - 2;i++){
            int first = i + 1,second = nums.length - 1,new_target = target - nums[i];
            while(first < second){
                if(nums[first] + nums[second] == new_target){
                    result[0] = nums[i];
                    result[1] = nums[first];
                    result[2] = nums[second];
                    return result;
                }if(nums[first] + nums[second] > new_target){
                    second--;
                }if(nums[first] + nums[second] < new_target){
                    first++;
                }
            }
        }
        return result;
    }
}
