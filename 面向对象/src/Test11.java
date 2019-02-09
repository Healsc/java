public class Test11 {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getSingleton();
        Singleton1 s2 = Singleton1.getSingleton();
        s1.dy();//单例模式
        s2.dy();//单例模式
        System.out.println(s1 == s2);//true
    }
}
class Singleton1{
    private Singleton1(){}
    private static Singleton1 s;
    //懒汉式
    public static Singleton1 getSingleton(){
       if(s == null){
           s = new Singleton1();
       }
        return s;
    }
    public void dy(){
        System.out.println("单例模式");
    }
}