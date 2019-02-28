public class MinNum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(minnum(arr));//0
    }
    public static int minnum(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}
