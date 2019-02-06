import java.util.Arrays;

public class Class17 {
    public static void main(String[] args){
        int[] arr = {1,2,3,0,9,8,7,6,5,4};
        int len = arr.length;
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len - i - 1;j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
