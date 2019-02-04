/**
 * 最大值
 * 最小值
 * */
public class Class11 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,9,8,7,6};
        int len = arr.length;
        int min = arr[0];
        int max = arr[0];
        for(int i = 1;i < len;i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
