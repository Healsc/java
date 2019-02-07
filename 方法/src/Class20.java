/**
 * 数组复制
 * */
import java.util.Arrays;
public class Class20 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr0 = Arrays.copyOf(arr,3);
        int[] arr1 = Arrays.copyOf(arr,6);
        int[] arr2 = Arrays.copyOf(arr,10);
        int[] arr4 = Arrays.copyOfRange(arr,3,6);
        System.out.println(Arrays.toString(arr0));
        //[1, 2, 3]
        System.out.println(Arrays.toString(arr1));
        //[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(arr2));
        //[1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr4));
        //[4, 5, 6]
    }
}
