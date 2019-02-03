import java.util.Scanner;

public class Class8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        boolean flag = false;
        for(int i = 0;i < arr.length;i++){
            if(x == arr[i]){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("WIN");
        }else{
            System.out.println("FAILURE");
        }
    }

}
