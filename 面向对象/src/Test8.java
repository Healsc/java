public class Test8 {
    public static void main(String[] args){
        Weapon w1 = new Weapon();
        w1.setName("xiaojian");
        w1.setAge(900);

        Hero liubei = new Hero();
        liubei.setName("xiaobei");
        liubei.setAge(700);
        liubei.setW(w1);

        w1.setH(liubei);
        System.out.println(liubei.getW().getName());//xiaojian
        System.out.println(liubei.getName());//xiaobei
    }
}
class Hero{
    private String name;
    private int age;
    private Weapon w;

    public Weapon getW() {
        return w;
    }

    public void setW(Weapon w) {
        this.w = w;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Weapon{
    private String name;
    private int age;
    private  Hero h;

    public Hero getH() {
        return h;
    }

    public void setH(Hero h) {
        this.h = h;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setH(String liubei) {
        this.name = liubei;
    }
}