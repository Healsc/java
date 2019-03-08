import java.util.LinkedList;
public class Test6 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        for(int i = 0;i < 9;i++){
            list1.add(i);
        }
        for(int i = 0;i < list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("-----");
        System.out.println(list1.get(3));
    }
}
