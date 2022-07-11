package bdqn.ch05;

import java.util.Scanner;

/**
 * @ClassName Demo02
 * @Description 用程序是西安“老狼老狼几点了”游戏，当12点，老狼开始抓人
 * @Author hyj98
 * @Date 2022-07-11 15:17
 * @Version 1.0
 */

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("老狼老狼几点了？");
        int answer = input.nextInt();
        while(answer != 12){
            System.out.println("老狼老狼几点了？");
            answer = input.nextInt();
        }
        System.out.println("老狼来抓你啦！快跑吧！");
    }
}
