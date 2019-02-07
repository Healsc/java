/**
 * 二分查找
 * */
import java.util.Arrays;

public class Class18 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(arr,2);
        System.out.println(index);//2
    }
}
