/**
 *     9
 *    99
 *   999
 *  9999
 * */
public class class12 {
    public static void main(String[] args){
        for(int i = 1;i < 5;i++){
            for(int j = 5;j >= 1;j-- ){
                if(j <= i){
                    System.out.print("9");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
