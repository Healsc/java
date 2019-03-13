public class Test4 {
    public  static void main(String args[]){
        int a = 12;
        int b = 21;
        System.out.println(a);
        System.out.println(b);
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    private static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
}
