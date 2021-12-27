package demo1.com;

public class demo3 {

    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer();
        System.out.println(str1.capacity());
        str1.append("123456789123456789");
        System.out.println(str1.capacity());

        StringBuffer str2 = new StringBuffer();
        System.out.println(str2.capacity());
        str2.ensureCapacity(30);//指定StringBuffer的最小容量，当前容量小于指定容量时，会根据既定扩展方式对容量进行扩展
        System.out.println(str2.capacity());
        str2.append("123456789123456789123456789123456789");
        System.out.println(str2.capacity());
    }
}
