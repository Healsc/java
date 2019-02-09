public class Test5 {
    public static void main(String[] args) {
        int x = 10;
        method(x);
        System.out.println(x);//10
    }
    public static void method(int mx){
        mx = 20;
    }
}
