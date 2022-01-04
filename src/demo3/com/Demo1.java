package demo3.com;

public class Demo1 {

    public static void main(String[] args) {
        int i_max = getMax(10,12);
        System.out.println(i_max);

        getMax2(5,7);
    }

    public static void getMax2(int value1 , int value2){
        int i_result = 0;
        if (value1 > value2) {
            i_result = value1;
        }else {
            i_result = value2;
        }
        System.out.println("void:" + i_result);
    }

    /**
     * 当方法需在主函数/某静态方法中调用时，必须使用static修饰
     * @param value1  数值1
     * @param value2  数值2
     * @return
     */
    public static int getMax(int value1 , int value2){
        int i_result = 0 ;
        if(value1 > value2){
            i_result = value1;
        }else{
            i_result = value2;
        }
        return i_result;
    }

}
