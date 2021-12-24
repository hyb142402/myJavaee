package demo1.com;


import java.text.MessageFormat;

public class demo2 {

    public static void main(String[] args) {
        String str = new String("元旦快了，赶紧放假吧！");
        System.out.println("字符串的字符个数:" + str.length());
        System.out.println(MessageFormat.format("根据索引值获取相应的字符：{0}",str.charAt(5)));//赶

        str = "abdabcdabcdea";
        System.out.println("查找子串第一次出现的索引值：" + str.indexOf("a"));
        System.out.println("查找子串最后一次出现的索引值：" + str.lastIndexOf("a"));

        /*System.out.println("字符串是否为空：" + str.isEmpty());//false
        str = "";
        System.out.println("字符串是否为空：" + str.isEmpty());//true
        str = null;
        System.out.println("字符串是否为空：" + str.isEmpty());//空指针异常*/

        System.out.println("字符串中是否包含指定内容：" + str.contains("abcdef"));//与indexof作用相同
        System.out.println("两个字符串内容是否一致(忽略大小写)：" + "ABDABCDABCDEA".equalsIgnoreCase(str));

        //截取字符串
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,6));
    }

}
