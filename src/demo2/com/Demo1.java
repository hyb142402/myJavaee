package demo2.com;

import java.util.Scanner;

public class Demo1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        test6();
    }

    /**
     * 判断一个数是不是5的倍数
     */
    public static void test1(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 5 == 0){
            System.out.println("是5的倍数");
        }else{
            System.out.println("不是5的倍数");
        }
    }

    /**
     * 判断一个数奇数还是偶数
     */
    public static void test2(){
        System.out.print("请输入一个数字：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        /*if( num % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }*/
        if(num % 2 == 0) System.out.println("偶数");
        else System.out.println("奇数");
    }

    /**
     * 三元运运算符
     */
    public static void test3(){
        System.out.println(1>2 ? "大于" : "小于");
    }

    /**
     * 星期判断
     */
    public static void test4(){
        System.out.print("请出入一个1-7的数字：");
        int week = Demo1.input.nextInt();
        if (week == 1) System.out.println("星期一");
        else if (week == 2) System.out.println("星期二");
        else if (week == 3) System.out.println("星期三");
        else if (week == 4) System.out.println("星期四");
        else if (week == 5) System.out.println("星期五");
        else if (week == 6) System.out.println("星期六");
        else if (week == 7) System.out.println("周末");
        else System.out.println("输入数字超出范围！");
    }

    /**
     * 判断季节
     */
    public static void test5(){
        int month = 5;
        if (month == 3 || month ==4 || month ==5){
            System.out.println("spring");
        }else if (month == 6 || month == 7 || month == 8){
            System.out.println("summer");
        }else if (month == 9 || month == 10 || month == 11){
            System.out.println("autumn");
        }else if (month == 12 || month ==1 || month == 2){
            System.out.println("winter");
        }else{
            System.out.println("月份不存在");
        }
    }

    /**
     * 闰年判断
     */
    public static void test6(){
        System.out.print("请输入年份：");
        int year = Demo1.input.nextInt();
        /*//能被4整除
        boolean flag = year % 4 == 0;
        //能被4整除且不能被100整除
        flag = flag && (year % 100 != 0);
        //能被400整除
        flag = flag || (year % 400 == 0);
        if (flag){
            System.out.println("闰年");
        }*/

        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.println("闰年");
        }
    }

}
