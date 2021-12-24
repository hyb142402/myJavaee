package demo1.com;

public class demo1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        /**
         * String str2 = "";当用这种方式创建字符串对象时，jvm首先会检查字符串常量池中是否存在该字符串对象，如果已存在
         * 就不会重新再创建，直接返回内存地址到新变量中。
         */
        System.out.println(str1 == str2);//true

        String str3 = new String("hello");
        /**
         * String str3 = new String("");当用这种方式创建字符串对象时，jvm首先会检查字符串常量池中是否存在该字符串对象，
         * 如果已存在，不会在字符串常量池中创建，但会在堆内存中再创建一份字符串对象，把字符串常量池中的字符串内容拷贝到堆内存中，
         * 返回堆内存中字符串对象的内存地址
         */
        System.out.println(str1 == str3);//false

        //------------------常用构造方法----------------------
        String s = new String();

        byte[] bufs = {96,97,98,99};
        //String(byte[] bytes)
        s = new String(bufs);
        System.out.println("byte[]:" + s);
        /**
         * System.out.println(MessageFormat.format("byte[]:{0}",s));  下标从0开始
         */
        //String(byte[] bytes,int offset,int length);offset:从数组中的哪个索引值(含)开始解码，length:解码元素个数
        s = new String(bufs,1,2);//快乐！
        System.out.println(s);

        //String(char[] value);
        char[] chars = {'元','旦','快','乐','！'};
        s = new String(chars);
        System.out.println(s);

        //String(char[] value,int offset,int count)
        s = new String(chars,2,3);
        System.out.println(s);
    }
}
