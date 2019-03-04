public class Test3 {
    public static void main(String[] args){
        ArrayList list = new ArrayList(10);

            //list.add(1);
            //list.add(2);
            for(int i = 0;i < 13;i++){
              list.add(i);
            }
            int size = list.getSize();
            for(int j = 0;j < size;j++){
                System.out.println(list.getData()[j]);
            }
        System.out.println("------");
        System.out.println(list.get(3));
        //System.out.println(list);
        //System.out.println(list.getData());
    }
}
