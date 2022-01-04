package demo3.com;

//重载
public class Demo2 {

    public static void main(String[] args) {

        int i_result = getMax(10,48);
        System.out.println(i_result);

        int[] arr = new int[]{-10,-12,0,1};
        i_result = getMax(arr);
        System.out.println(i_result);
    }

    /*
    * 重载：函数名相同  与返回值无关  函数的参数列表或参数类型不同
    * */

    public static int getMax(int value1 , int value2){
        int i_result = 0;
        if (value1 > value2) {
            i_result = value1;
        }else {
            i_result = value2;
        }
        return i_result;
    }

    public static int getMax(int[] args){
        int i_result = 0;
        int arrLen = args.length;
        if (arrLen == 0) {
            System.out.println("输入参数为空，退出！");
            return 0;
        } else {
            for (int i=0;i<arrLen;i++){
                if (i_result < args[i]){
                    i_result = args[i];
                }
            }
        }
        return i_result;
    }
}
