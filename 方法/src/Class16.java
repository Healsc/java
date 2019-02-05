/**
 * 二分查找
 * */
public class Class16 {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,7,8,9};
        int index = sel(arr,7);
        System.out.println(index);
    }
    public static int sel(int[] arr,int val){
        int start = 0;
        int end = arr.length;
        do{
            int i = (start + end) / 2;
            if(val > arr[i]){
                start = i + 1;
            }else if(val < arr[i]){
                end = i - 1;
            }else{
                return i;
            }
        }while(start <= end);
        return -1;
    }
}
