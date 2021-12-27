package demo1.com;

import com.sun.javafx.binding.StringFormatter;

import java.text.MessageFormat;

public class demo4 {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer();
        System.out.println(MessageFormat.format("stringBuffer初始长度：{0}",strBuf.capacity()));
        System.out.println(MessageFormat.format("stringBuffer初始长度：{0}",strBuf.length()));
        //增加
        strBuf.append("今年春节放假只休息七天！");
        strBuf.insert(2,"是2021年，");
        System.out.println(strBuf);//今年是2021年，春节放假只休息七天！

        //删除
        strBuf.delete(2,2+"是2021年,".length());//包头不包尾
        System.out.println(strBuf);//今年春节放假只休息七天！

        strBuf.deleteCharAt(6);
        System.out.println(strBuf);//今年春节放假休息七天！

        //修改
        strBuf.replace(0,1,"2021");
        System.out.println(strBuf);//2021年春节放假休息七天！

        strBuf.reverse();//反转
        System.out.println(strBuf);//！天七息休假放节春年1202

        strBuf.reverse();
        strBuf.setCharAt(3,'2');
        System.out.println(strBuf);//2022年春节放假休息七天！

        StringBuffer strBuf2 = new StringBuffer().append(strBuf.substring(0,5));//包头不包尾
        System.out.println(strBuf2);//2022年

        strBuf.ensureCapacity(5);
        System.out.println(strBuf);

        //查看
        System.out.println("字符串首次出现的位置："+strBuf.indexOf("2"));
        System.out.println("字符串自指定位置首次出现的位置："+strBuf.indexOf("2",2));//包含指定位置
    }
}
