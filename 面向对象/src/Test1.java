public class Test1 {
    public static void main(String[] args){
    Person p1 = new Person();
    p1.name = "xiaowu";
    p1.age = 10;
    p1.school = "neau";
    System.out.println(p1.name);
    System.out.println(p1.age);
    System.out.println(p1.school);
    p1.hi();
    }
}
class Person{
    String name;
    int age;
    String school;
    void hi(){
        System.out.println("hi，"+name);
    }
}
