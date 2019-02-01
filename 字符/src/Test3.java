import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆柱体的高：");
        int h = input.nextInt();
        System.out.println("请输入圆柱体的半径：");
        int r = input.nextInt();
        System.out.println("圆柱体体积为："+ 3.14 * r * r * h );
    }

}
