/**
 * 判断数组相等
 * */
import java.util.Arrays;

public class Class21 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = Arrays.copyOf(arr,7);
        int[] arr2 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.equals(arr,arr1));
        //true
        System.out.println(Arrays.equals(arr,arr2));
        //false
    }
}
