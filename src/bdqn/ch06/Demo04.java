package bdqn.ch06;

import java.util.Scanner;

/**
 * @ClassName Demo04
 * @Description break作用是：
 *                  退出循环
 * @Author hyj98
 * @Date 2022-07-14 14:43
 * @Version 1.0
 */

public class Demo04 {
    public static void main(String[] args) {
        //总人数
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i<=10;i++){
            System.out.println("请输入第"+i+"班游船人数");
            int num = input.nextInt();
            sum+=num;
            if (sum>5000){
                System.out.println("现已停船，岛上人数达到上线");
                break;
            }
        }
        System.out.println("今日岛上人数："+sum);
    }
}
