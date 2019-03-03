public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,8,7,45,-3};
        System.out.println(second(arr));
    }
    public static int second(int[] nums){
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < min){
                second = min;
                min = nums[i];
            }else if(nums[i] < second){
                second = nums[i];
            }
        }
        /*for(int i = 0;i < nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == min){
                continue;
            }
            if(nums[i] < second){
                second = nums[i];
            }
        }*/
        return second;
    }
}
