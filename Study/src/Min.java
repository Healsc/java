public class Min {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(minnum(arr));
    }
    public static int minnum(int[] nums){
        int min = nums[0];
        for(int i = 2;i < nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}
