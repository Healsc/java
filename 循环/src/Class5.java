/***
 * 阶乘
 * */

public class Class5 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        do{
            int j = 1;
            int jc = 1;
            do{
                jc *= j;
                j++;
            }while(j <= i);
            i++;
            sum += jc;
        }while(i <= 3);
        System.out.println(sum);
    }
}
