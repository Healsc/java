public class ArrayList {
    private int capacity;
    private int size;
    int[] data;


    public ArrayList(int capacity_) {
        capacity = capacity_;
        size = 0;
        data = new int[capacity_];
    }

    public void add(int value){
        if(size < this.data.length){
            data[this.size] = value;
        }else{
            int[] temp = this.data;
            capacity *= 2;
            this.data = new int[capacity];
            for(int i = 0;i < size;i++){
                data[i] = temp[i];
            }
            data[size] = value;
        }
        size++;
    }
    public int[] getData(){
        return this.data;
    }
    public int getSize(){
        return size;
    }
}
