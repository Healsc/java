public class Class9 {
    public static void main(String[] args){
        int[] no = {1,2,3,4};
        int len = no.length;
        System.out.println(len);
        for(int i = 0;i <= len;i++){
            //数组越界
            System.out.println(no[i]);
        }
    }
}
