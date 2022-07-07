package bdqn.demo1;

import java.util.Scanner;

public class Xiti {
    public static void main(String[] args) {

        System.out.println("****欢迎来到虾神俱乐部————萌虾大转盘****");

        System.out.print("请输入5位抽奖号码：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //获得每位数字
        /*int ge = number%10;
        int shi = number%100/10;
        int bai = number%1000/100;
        int qian = number%10000/1000;
        int wan = number%100000/10000;*/

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        int qian = number / 1000 % 10;
        int wan = number / 10000 ;

        boolean result = (ge + shi) == (qian + wan);

        System.out.println("个位数是：" + ge);
        System.out.println("十位数是：" + shi);
        System.out.println("百位数是：" + bai);
        System.out.println("千位数是：" + qian);
        System.out.println("万位数是：" + wan);
        System.out.println("是否为幸运观众：" + result);
    }
}
