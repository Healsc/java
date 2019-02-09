public class Test4 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("wangcai");
        d1.setAge(10);
        d1.dy();
        Dog d3 = new Dog("xiaowu",10);
    }
}
class Dog{
    private String name;
    private int age;
    public Dog(){
        //new一个实例化对象时候，自动调用
        System.out.println("构造");
    }
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("构造方法");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println(age);
    }
    public void dy(){
        System.out.println("woshifangfa");
    }
}
