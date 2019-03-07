import java.util.LinkedList;

public class Test7 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push("123");
        stack1.push(123);
        System.out.println(stack1);
    }
    static class Stack{
        private LinkedList list = new LinkedList();
        
        public void push(Object num){
            list.addFirst(num);
        }
        public Object top(){
            return list.getFirst();
        }
        public Object pop(){
            return list.removeFirst();
        }
    }
}
