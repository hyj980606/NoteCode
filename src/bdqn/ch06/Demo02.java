package bdqn.ch06;

import java.util.Scanner;

/**
 * @ClassName Demo02
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-12 15:13
 * @Version 1.0
 */

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 6; i++){
            System.out.println("请输入第"+i+"月奖品预算元：");
            int money = input.nextInt();
            sum+=money;
        }
        System.out.println("奖金预算金额："+sum);
    }
}
