package bdqn.ch04;

import java.util.Scanner;

/**
 * @ClassName Demo01
 * @Description                 switch选择结构
 *              1、语法：
 *                  switch(表达式) {
 *                      case 常量1:
 *                          语句;
 *                          break;
 *                      case 常量2:
 *  *                       语句;
 *  *                       break;
 *                      case 常量3:
 *  *                       语句;
 *  *                       break;
 *                      default:
 *                          语句;
 *                          break;
 *                  }
 *              2、break:结束,跳出循环
 *              3、default:
 *              4、比较switch和if选择结构
 *                  相同点：
 *                      都是用来处理
 *                  不同点：
 *
 * @Author hyj
 * @Date 2022-07-11 13:42
 * @Version 1.0
 */

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份：");


        /*if (month == 7) {
            System.out.println("去青岛");
        }else if (month == 8){
            System.out.println("去西藏");
        }else if (month == 9){
            System.out.println("去新疆");
        }else if (month == 10){
            System.out.println("去九寨沟");
        }else {
            System.out.println("网站推荐");
        }*/

        if (input.hasNextInt()){
            int month = input.nextInt();
            switch (month){
                case 7:
                    System.out.println("去青岛");
                    break;
                case 8:
                    System.out.println("去西藏");
                    break;
                case 9:
                    System.out.println("去新疆");
                    break;
                case 10:
                    System.out.println("去九寨沟");
                    break;
                default:
                    System.out.println("网站推荐");
            }
        }else {
            System.out.println("你输入的不是数字！");
        }
    }
}
