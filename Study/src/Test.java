public class Test {
    public static void main(String[] args){
       // final int a = 10;//声明常量，不可修改
        System.out.println("Hello World");
        //static 不用创建对象 ，属性可以直接访问
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumNum(arr));
    }
     static int sumNum(int[] nums){
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
}
