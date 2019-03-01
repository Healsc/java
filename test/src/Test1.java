public class Test1 {
    public static void main(String[] args){

    }
    public static int remove(int[] array){
        if(array .length == 0){
            return 0;
        }
        else if(array.length == 1){
            return 1;
        }
        else{
            int temp = array[0];
            int len = 1;
            for(int i = 1;i < array.length;++i){
                if(temp == array[i]){
                    continue;
                }
                else{
                    temp = array[i];
                    array[len] = array[i];
                    len ++;
                }
            }
            return len;
        }
    }
}
