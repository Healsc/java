public class SecondMinNum1 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,0,9,8,7,6};
        System.out.println(secondMinNum(arr));//1
    }
    public static int secondMinNum(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        int secondMin = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == min){
                continue;
            }
            if(nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }
        return secondMin;
    }
}
