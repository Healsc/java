public class Sum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sum(arr));//45
    }
    public static int sum(int[] nums){
        int result = 0;
        for(int i = 0; i < nums.length;i++){
            result += nums[i];
        }
        return result;
    }
}
