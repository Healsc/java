import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0;i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
