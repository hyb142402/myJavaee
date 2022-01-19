package demo2.com;

import org.junit.Test;

public class Demo3 {

    public static void main(String[] args) {
        test1();
    }

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

}
