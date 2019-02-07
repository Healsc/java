/**
 * 数组填充
 * */
import java.util.Arrays;
public class Class22 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Arrays.fill(arr,9);
        System.out.println(Arrays.toString(arr));
        //[9, 9, 9, 9, 9, 9, 9, 9, 9]
        Arrays.fill(arr,2,5,0);
        System.out.println(Arrays.toString(arr));
        //[9, 9, 0, 0, 0, 9, 9, 9, 9]
    }
}
