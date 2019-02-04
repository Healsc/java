import java.util.Arrays;
public class Class15 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,9,8,7,5,6};
        int len = arr.length;
        for(int i = 1;i < len;i++){
            int temp = arr[i];
            int j;
            for(j = i - 1;j >= 0;j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }else{
                    arr[j+1] = temp;
                    break;
                }
                if(j == 0){
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
