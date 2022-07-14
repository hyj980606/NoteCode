package bdqn.ch06;

import java.util.Scanner;

/**
 * @ClassName Demo04
 * @Description break作用是：
 *                  主要用在循环语句或者switch语句中，用来跳出整个语句块
 *                  break跳出最里层的循环，并且继续执行该循环下面的语句
 * @Author hyj
 * @Date 2022-07-14 14:43
 * @Version 1.0
 */

public class Demo04 {
    public static void main(String[] args) {
        //总人数
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i<=10;i++){
            System.out.println("请输入第"+i+"班游船人数：");
            int num = input.nextInt();
            sum+=num;
            if (sum>5000){
                System.out.println("现已停船，岛上人数达到上线");
                break;
            }
        }
        System.out.println("今日岛上人数："+sum);

        /*for (int i=1;i<=5;i++){
            if (i==3){
                System.out.println("口渴了跑不动退出");
                break;
            }
            System.out.println(i);
        }*/
    }
}
