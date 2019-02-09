public class Test7 {
    public static void main(String[] args) {
        String name = "xiaofei";
        method(name);
        System.out.println(name);//xiaofei
    }
    public static void method(String name){
        name = "xiaobei";
    }
}
