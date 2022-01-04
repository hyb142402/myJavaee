package demo3.com;

import java.text.MessageFormat;
import java.util.Arrays;

public class Demo3 {

    public static void main(String[] args) {
        int[] arr = {12,10,55,18,-8,0,16,17,9,16,18};
        System.out.println(MessageFormat.format("原始数组：{0}",Arrays.toString(arr)));
        sort(arr,3);
        System.out.println(MessageFormat.format("排序后数组：{0}",Arrays.toString(arr)));
    }

    /**
     * 降序排列
     * @param args  原始数组
     * @param mode  排序方式
     * @return
     */
    public static int[] sort(int[] args, int mode) {
        int count=0;
        switch(mode){
            case 1 : //直接排序
                for (int i=0;i<args.length-1;i++) {
                    for(int y = i+1;y<args.length;y++){
                        count++;
                        if(args[i] < args[y]){
                           int temp = args[i];
                           args[i] = args[y];
                           args[y] = temp;
                        }
                    }
                }
                break;
            case 2 : //冒泡排序
                for(int i = 0;i<args.length-1;i++){
                    for(int j = 0;j<args.length-i-1;j++){
                        count++;
                        if(args[j] < args[j+1]){
                            int temp = args[j];
                            args[j] = args[j+1];
                            args[j+1] = temp;
                        }
                    }
                }
                break;
            case 3 :
                Arrays.sort(args);//sort 从小到大排序
                arrReversal(args);
            default:
                System.out.println("参数输入错误！");
                break;
        }
        System.out.println("循环次数：" + count);
        return args;
    }

    /**
     * 数组反转
     */
    public static void arrReversal(int[] args){
        int[] newArr =new int[args.length];
        int j = 0;
        for (int i = args.length-1;i>=0;i--){
            newArr[j] = args[i];
            j++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
