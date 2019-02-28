public class SecondMinNum3 {
    public static void main(String[] args){
        int[] arr = {1,9,2,8,3,7,4,0,5,4};//3
        System.out.println(secondMinNum(arr));//1
    }
    public static int secondMinNum(int[] nums){
        int min = Math.min(nums[0],nums[1]);
        int secondMin = Math.max(nums[0],nums[1]);
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < min){
                secondMin = min;
                min = nums[i];
            }else if(nums[i] < secondMin){
                secondMin = nums[i];
            }
        }
        return secondMin;
    }
}
