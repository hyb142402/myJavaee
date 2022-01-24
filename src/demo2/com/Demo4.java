package demo2.com;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.Scanner;

public class Demo4 {

    @Test
    /**
     * 猜数字
     */
    public void test1(){
        int num = -1;
        int i_random = (int)(Math.random()*100)+1;
        System.out.println(i_random);
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("请输入一个1-100之间的数字：");
            num = sc.nextInt();
            count++;
            if(num > i_random){
                System.out.println("大了");
            }else if (num < i_random){
                System.out.println("小了");
            }else {
                System.out.println("恭喜，猜中了");
            }
        }while(num != i_random);

        System.out.println("您一共猜了" + count + "次！");
    }

    @Test
    /**
     * 计算器
     */
    public void test2(){

        String flag = "y";
        Scanner sc = new Scanner(System.in);
        do {
            int num1 = (int) (Math.random() * 10) + 1;
            int num2 = (int) (Math.random() * 10) + 1;

            int i = (int) (Math.random() * 5);
            switch (i) {
                case 0:
                    System.out.println(MessageFormat.format("{0}+{1}={2}", num1, num2, num1 + num2));
                    break;
                case 1:
                    System.out.println(MessageFormat.format("{0}-{1}={2}", num1, num2, num1 - num2));
                    break;
                case 2:
                    System.out.println(MessageFormat.format("{0}*{1}={2}", num1, num2, num1 * num2));
                    break;
                case 3:
                    System.out.println(MessageFormat.format("{0}/{1}={2}", num1, num2, num1 / num2));
                    break;
                case 4:
                    System.out.println(MessageFormat.format("{0}%{1}={2}", num1, num2, num1 % num2));
                    break;
            }
            System.out.print("是否继续(y-继续)：");
            flag = sc.next();
        }while("y".equalsIgnoreCase(flag));
    }

}
