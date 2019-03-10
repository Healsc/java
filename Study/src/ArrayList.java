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
    public void add(int index,int value){
        if(index > 0 && index < size){
            size++;
            int temp = data[index];
            int i = this.size - 2;
            //System.out.println(i);
            for(;i > index;i--){
                data[i+1] = data[i];
            }
            data[index+1] = temp;
            data[index] = value;
        }else{
            System.out.println("ERROR");
        }
    }
    public void remove(int index){

        for(;index < data.length-1;index++){
            data[index] = data[index+1];
        }
        size--;
        int[] arr = new int[size];
        for(int i = 0;i < size;i++){
            arr[i] = data[i];
        }
       this.data = arr;
    }
    public int[] getData(){
        return this.data;
    }
    public int getSize(){
        return size;
    }
    public int get(int index){
        if(index < 0 || index > data.length- 1 ){
            return -1;
        }else{
            return data[index];
        }
    }
}
