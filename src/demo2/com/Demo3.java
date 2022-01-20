package demo2.com;

import org.junit.Test;

import java.util.Scanner;

public class Demo3 {


    /**
     *
     */
    public static void test1(){
        int count = 0;

        while(count < 100){
            System.out.println("hello woid" + count);
            count++;
        }
    }

    @Test
    public void test2(){
        System.out.println(12346);
    }

    /**
     * 1-100的奇数和
     */
    @Test
    public void test3(){
        int num = 1;
        int sum = 0;
        while(num <= 100){
            if(num % 2 != 0){
                sum += num;
            }
            num++;
        }
        System.out.println("1-100的奇数和：" + sum);
    }

    /**
     * 1-9之和
     */
    @Test
    public void test4(){
        int i = 1;
        int sum = 0;
        while(i < 10){
            sum += i;
            i ++ ;
        }
        System.out.println(sum);
    }

    @Test
    public void test5(){
        Scanner sc = new Scanner(System.in);

        int i_random = (int)(Math.random()*100)+1;
        int i = -1;

        while(i != i_random){
            System.out.print("请输入1-100之间整数：");
            i = sc.nextInt();
            if (i == i_random) System.out.println("猜中了");
            else if (i > i_random) System.out.println("大了");
            else System.out.println("小了");
        }
    }

}
