public class Class10 {
    public static void main(String[] args) {
        int[][] score = {{112,2,2},{1,2,3},{1,2,3}};
        for(int i = 0;i < 3;i++){
            int sum = 0;
            for(int j = 0;j < 3;j++){
                sum += score[i][j];
            }
            System.out.println(sum/3);
        }
    }
}
