/**
 * 冒泡排序
 * */

import java.util.Arrays;

public class Class12 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,9,8,7,6,5,0};
        int len = arr.length;
        int temp;
        for(int i = 0;i <len;i++){
            for(int j = i + 1;j < len;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0;i < len;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
