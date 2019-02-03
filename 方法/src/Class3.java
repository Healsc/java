public class Class3 {
    public static void main(String[] args){
        int[] no = new int[5];
        no[0] = 111;
        no[1] = 222;//不赋值，默认为0
        System.out.println(no);//[I@16d3586 输出的是地址
        for(int i = 0;i < no.length;i++){
            System.out.println(no[i]);
        }

    }
}
