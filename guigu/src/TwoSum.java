import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0;i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target = input.nextInt();
        System.out.println("target="+target);
        int[] result = twoSum(arr,target);
//        for(int i = 0;i < result.length;i++){
//            System.out.println(result[i]);
//        }
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums,int target){
        int[] result = new int[2];
        if(nums.length < 2){
            return result;
        }
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        int first = 0;
        int second = nums.length - 1;
        while(first < second){
            if(nums[first] + nums[second] == target){
                result[0] = nums[first];
                result[1] = nums[second];
                return result;
            }if(nums[first] + nums[second] > target){
                second--;
            }if(nums[first] + nums[second] < target){
                first++;
            }
        }
        return result;
    }
}
