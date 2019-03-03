public class Test2 {
    public static void main(String[] args){

    }
    static int searchInsert(int[] nums, int target) {
        int flag = 0;
        if(nums.length == 0){
            return flag=0;
        }
        else{
            for(int i = 0;i < nums.length;i++){
                if(nums[i] == target){
                    return flag=i;
                }
                else if(nums.length == 1){
                    if(nums[0] > target){
                        return flag=0;
                    }else{
                        return flag=1;
                    }
                }
                else{
                    if(nums[i] < target && nums[i+1] > target){
                        return flag = i + 1;
                    }
                    }
                }
            }
        return flag;
        }
}

