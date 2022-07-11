package bdqn.ch04;

import java.util.Scanner;

/**
 * @ClassName Demo01
 * @Description                 switch选择结构
 *              break:结束
 *              default:
 * @Author hyj
 * @Date 2022-07-11 13:42
 * @Version 1.0
 */

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = input.nextInt();


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
    }
}
