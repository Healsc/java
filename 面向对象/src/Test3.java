public class Test3 {
    public static void main(String[] args) {
        Persons p1 = new Persons();
        //p1.name = "zhangsan";Error:(4, 11) java: name 在 Persons 中是 private 访问控制
        //p1.age = 11;//Error:(5, 11) java: age 在 Persons 中是 private 访问控制
       p1.setName("zhangsan");
       p1.setAge(10);
       System.out.println(p1.getName());//zhangsan
       System.out.println(p1.getAge());//10
       p1.say();//name is zhangsan age is 10

    }
}
class Persons{
    private String name;//private修饰符，代表私有的
    private int age;

    public void setName(String name){
        this.name = name;//对当前对象的引用
    }//设置名字
    public void setAge(int age){
        this.age = age;
    }//设置年龄
    public String getName(){
        return this.name;
    }//获取当前名字
    public int getAge(){
        return this.age;
    }//获取当前年龄
    void say(){
        System.out.println("name is "+name+" age is "+age);
    }
}