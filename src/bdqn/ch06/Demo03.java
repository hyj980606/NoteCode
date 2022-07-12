package bdqn.ch06;

import java.util.Scanner;

/**
 * @ClassName Demo03
 * @Description 在线旅行平台每月为发布游记的会员额外发放200个会员积分
 *              每人发放20个积分。输出当前积分数以及已领取的会员数
 * @Author hyj98
 * @Date 2022-07-12 15:20
 * @Version 1.0
 */

public class Demo03 {
    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入积分总数：");
        int integral = input.nextInt();
        for (;integral >= 0;){
            System.out.println("当前剩余积分：" + integral + ",已有" + i + "位会员领取额外奖励！");
            integral = integral - 20;
            i++;
        }
    }
}
