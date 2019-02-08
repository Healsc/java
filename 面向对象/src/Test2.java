public class Test2 {
    public static void main(String[] args){
        Per p1 = null;
        p1 = new Per();
        p1.name = "xiaowu";
        p1.age = 20;

        Per p2 = p1;
        p2.name = "xiaosan";
        System.out.println(p1.name);//xiaosan p1和p2指向同一内存空间
    }
}
class Per{
    String name;
    int age;
}