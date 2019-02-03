public class Class7 {
    public static void main(String[] args){
        dy(1,2,3,4,5,6);
    }
    public static void dy(int ...a){
        for(int x:a){
            System.out.println(x);
        }
    }
}
