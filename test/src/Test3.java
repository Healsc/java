public class Test3 {
    public static void main(String[] args){

    }
    static int maxSubArray(int[] nums) {
        int maxSum = 0;
        if(nums.length == 1){
            maxSum=nums[0];
            return maxSum;
        }else{
            for(int i = 0; i < nums.length;i++){
              maxSum += i;
            }
            int first = 0, end = nums.length - 1;
            int sum1 = 0,sum2 = 0;
            for(int i = first + 1;i < nums.length;i++){
                sum1 += i;
                if(sum1 > maxSum){
                    maxSum = sum1;
                }
            }
            for(int j = end; j > 0;j++){
                sum2 += j;
                if(sum2 > maxSum){
                    maxSum = sum2;
                }
            }
            return maxSum;
        }
    }
}
