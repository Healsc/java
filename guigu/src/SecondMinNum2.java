public class SecondMinNum2 {
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,4,3};//4
        System.out.println(secondMinNum(arr));
    }
    public static int secondMinNum(int[] nums){
        int min = Math.min(nums[0],nums[1]);
        int secondMin = Math.min(nums[0],nums[1]);
        for(int i = 2;i < nums.length;i++){
            if(nums[i] < min){
                secondMin = min;
                min = nums[i];
            }else if(nums[i] == min){
                secondMin = min;
            }else if(nums[i] > min && nums[i] < secondMin){
                secondMin = nums[i];
            }else if(nums[i] == secondMin){
                continue;
            }else{
                continue;
            }
        }
        return secondMin;
    }
}
