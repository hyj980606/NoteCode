package bdqn.ch14;

import java.util.Scanner;

/**
 * @ClassName TestJuicer
 * @Description 测试
 * @Author hyj
 * @Date 2022-07-25 16:08
 * @Version 1.0
 */

public class TestJuicer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你喜欢的水果：");
        String fruit = input.next();
        Juicer juicer = new Juicer();
        String fruits = juicer.fruit(fruit);
        System.out.println("获得新鲜的"+fruits);
    }
}
