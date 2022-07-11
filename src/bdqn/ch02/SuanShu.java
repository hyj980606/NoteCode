package bdqn.ch02;

import java.util.Scanner;

public class SuanShu {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        //整数  只能取整数
        int num3 = num1/num2;  //商
        int num4 = num1%num2;  //取余数
        System.out.println(num3);
        System.out.println(num4);

        num1++;
        System.out.println(num1);

        //从控制台输入两个数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num5 = input.nextInt();
        System.out.println("请输入第二个数：");
        int num6 = input.nextInt();

        //求和
        int qiuhe = num5 + num6;
        System.out.println("两个数之和：" + qiuhe);

        //求差
        int cha = num5 - num6;
        System.out.println("两个数之差：" + cha);

        //求积
        int ji = num5 * num6;
        System.out.println("两个数之积：" + ji);

        //求商
        int shang = num5 / num6;
        System.out.println("两个数之商：" + shang);

        //取余
        int yu = num5 % num6;
        System.out.println("两个数的余数：" + yu);

    }
}
