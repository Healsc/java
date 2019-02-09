public class Test9 {
    public static void main(String[] args) {
         User.say();
         //hello world
         //在一个类中定义一个方法为static，那就是说，无需本类的对象即可调用此方法
    }
}
class User{
    public static void say(){
        System.out.println("hello world");
    }
}