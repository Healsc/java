/**
 * 被7整除不能被4整除
 * */
public class Class8 {
    public static void main(String[] args){
        for(int i = 0; i < 200;i++){
            if(i % 7 == 0 && i % 4 != 0){
                System.out.println(i);
            }
        }
    }
}
