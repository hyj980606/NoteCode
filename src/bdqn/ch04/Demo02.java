package bdqn.ch04;

import java.util.Scanner;

/**
 * @ClassName Demo02
 * @Description 实现控制台程序，输入年份和月份，输出该月份的天数
 *               一年中每个月的天数的规则
 *               1、3、5、7、8、10、12月：31天
 *               4、6、9、11月：30天
 *               2月：闰年29天，平年28天
 *               判断是否是闰年的规则
 *                  能被4整除但不能被100整除或能被400整除的年份
 *                  年份 % 4 == 0 && 年份 % 100 != 0 || 年份 % 400 == 0
 * @Date 2022-07-11 14:08
 * @Version 1.0
 */

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();

        System.out.print("请输入月份：");
        int month = input.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.println("29天");
                }else {
                    System.out.println("28天");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
        }
    }
}
