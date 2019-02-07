import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shuangseqiu {
    public static void main(String[] args){
        int[] redBalls = new int[33];
        int len = redBalls.length;
        for(int i = 0;i < len;i++){
            redBalls[i] = i + 1;
        }

        int[] userReds = new int[6];
        int userBlue = 0;
        int[] reds = new int[6];
        int blue = 0;

        System.out.println("请选择（1，机选（2）人选）");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Random r = new Random();
        switch(num){
            case 1:
                    computerSel(redBalls,userReds);
                    userBlue = r.nextInt(16) + 1;
                    System.out.println(Arrays.toString(userReds));
                break;
            case 2:
                System.out.println("请输入6个红色");
                for(int i = 0;i < userReds.length;i++){
                    userReds[i] = input.nextInt();
                }
                System.out.println("请输入1个蓝色");
                userBlue = input.nextInt();
                break;
        }
        computerSel(redBalls,reds);
        blue = input.nextInt();
        int selRed = 0;
        int selBlue = 0;
        for(int i = 0;i < 6;i++){
            for(int j = 0;j < 6;j++){
                if(userReds[i] == reds[j]){
                    selRed++;
                }
            }
        }

    }
    public static void computerSel(int[] balls,int[] redBalls){
        Random r = new Random();
        for(int i = 0;i < redBalls.length;i++){
            int index = r.nextInt(balls.length - i);
            redBalls[i] = balls[index];
            int temp =balls[index];
            balls[index] = balls[balls.length - i - 1];
            balls[balls.length - i - 1] = temp;
        }
    }
}
