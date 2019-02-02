/**
 * 计算1--10阶乘
 * */
public class Class2 {
    public static void main(String[] args){
        int i = 1;
        int jc = 1;
        while(i <= 10){
            jc *= i;
            i++;
        }
        System.out.println(jc);
    }
}
