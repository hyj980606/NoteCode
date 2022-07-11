package bdqn.ch05;

import java.util.Scanner;

/**
 * @ClassName Demo04
 * @Description             do...while循环
 *              对于while语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
 *              do...while循环和while循环相似，不同的是，do...while循环至少会执行一次。
 *              语法：
 *                  do{
 *                      //代码块
 *                  }while(布尔表达式);
 * @Author hyj98
 * @Date 2022-07-11 16:04
 * @Version 1.0
 */

public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            System.out.println("接餐-送餐");
            System.out.println("是否有客人继续等餐");
            answer = input.next();
        }while (answer.equals("y"));
        System.out.println("没有客人等餐");
    }
}
