public class Test10 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        s1.dy();//单例模式
        s2.dy();//单例模式
        System.out.println(s1 == s2);//true
    }
}
class Singleton{
    private Singleton(){}
    private static Singleton s = new Singleton();
    //饿汉式
    public static Singleton getSingleton(){
        return s;
    }
    public void dy(){
        System.out.println("单例模式");
    }
}