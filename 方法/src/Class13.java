import java.util.Arrays;

/**
 * 选择排序
 * */
public class Class13 {
    public static void main(String[] args){
        int[] arr = {1,2,3,0,9,8,8,7,6,5};
        int len = arr.length;
         for(int i = 0;i < len;++i){
             int index = i;
             for(int j = i + 1;j < len;j++){
                 if(arr[index] > arr[j]){
                     index = j;
                 }
             }
             if(index != i){
                 int temp;
                 temp = arr[i];
                 arr[i] = arr[index];
                 arr[index] = temp;
             }
         }
        System.out.println(Arrays.toString(arr));
    }
}
