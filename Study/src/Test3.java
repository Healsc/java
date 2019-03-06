public class Test3 {
    public static void main(String[] args){
        ArrayList list = new ArrayList(10);

        //list.add(1);
        //list.add(2);
        for(int i = 0;i < 9;i++){
          list.add(i);
        }
        list.add(8,99);
        int size = list.getSize();
        list.remove(1);
        for(int j = 0;j < size-1;j++){
            System.out.println(list.getData()[j]);
        }
        //System.out.println("------");
        //System.out.println(list.get(3));
        //System.out.println(list.get(9999));
        //System.out.println(list);
        //System.out.println(list.getData());
    }
}
