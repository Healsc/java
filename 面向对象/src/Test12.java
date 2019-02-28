public class Test12 {
    public static void main(String[] args){
        ChickenManage cm = new ChickenManage(5);


    }
}
class ChickenManage{
    private Chicken[] ck;
    public ChickenManage(int size){
        if(size < 5){
            ck = new Chicken[5];

        }else{
            ck = new Chicken[size];
        }
    }
    public void add(){
        
    }
}

class Chicken{
    private String name;
    private int age;
    private int weight;

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
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void dy(){
        System.out.println(this.name+","+this.age+","+this.weight);
    }
}