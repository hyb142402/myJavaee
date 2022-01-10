package demo2.com;

public class Demo2 {

    public static void main(String[] args) {
        test2();
    }

    /**
     * 季节判断
     */
    public static void test1(){
        int month = 10;
        switch(month){
            case 3 :
            case 4 :
            case 5 :
                System.out.println("spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("autumn");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("winter");
                break;
            default :
                System.out.println("月份超出范围");
                break;
        }
    }

    /**
     * 成绩判断
     */
    public static void test2(){
        double score = 90.7;
        int i = ((int)score)/10;
        switch(i){
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("E");
                break;
            case 6 :
                System.out.println("D");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 9 :
            case 10 :
                System.out.println("A");
                break;
            default:
                System.out.println("error");
                break;
        }
    }

}
