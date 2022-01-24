package demo2.com;

import org.junit.Test;

import java.text.MessageFormat;

public class Demo5 {

    @Test
    public void  test1(){
        for (int i = 0; i<5 ;i++){
            System.out.println("hello world！");
        }
    }

    @Test
    //1-10之间的和
    public void test2(){
        int i_sum = 0;
        for (int i=1;i<=10;i++){
            i_sum += i;
        }
        System.out.println("1-10之间的和：" + i_sum);
    }

    @Test
    //1-100之间 7的倍数的个数
    public void test3(){
        int count = 0;
        for(int x = 1;x <= 100; x++){
            if (x % 7 == 0){
                count++;
            }
        }
        System.out.println("1-100之间7的个数为：" + count);
    }

    @Test
    //图案打印
    public void test4(){
        for (int x =5 ; x >0 ;x--){
            for (int y = x ; y > 0; y--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    //99乘法表
    public void test5(){
        for ( int i = 1; i < 10 ; i++ ){
            for ( int m = 1 ; m <= i ; m++ ){
                System.out.print(MessageFormat.format("{0}*{1}={2}\t",i,m,i*m));
            }
            System.out.println();
        }
    }

    //99乘法表，打印到第一个结果为20
    @Test
    public void test6(){
        outer:for ( int i = 1; i < 10 ; i++ ){
            inner:for ( int m = 1 ; m <= i ; m++ ){
                int n = i*m;
                System.out.print(MessageFormat.format("{0}*{1}={2}\t",i,m,n));
                if (n == 20){
                    break outer;
                }
            }
            System.out.println();
        }
    }
}
