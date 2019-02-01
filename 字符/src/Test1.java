public class Test1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.print(c);
        byte d = 10;//byte字节型 占用字节1，取值范围-128--127，默认值0；
        short s = 20;//short短整型，占用字节2，-32768--32767，默认值0；
        int i = 12;//int整型，占用字节4，默认值0；
        long l = 11;//long长整型，占用字节8；
        char ch = 'A';//cahr字符型占用字节2；
        float f = 111;//float单精度浮点型，占用字节4；
        double dou = 123;//double双精度浮点型，占用字节8；
        boolean flag = true;//boolean 所占字节，不定值，取值范围true、false 默认值为false
    }
}
