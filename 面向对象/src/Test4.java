public class Test4 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("wangcai");
        d1.setAge(10);
        d1.dy();
    }
}
class Dog{
    private String name;
    private int age;
    public Dog(){

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
