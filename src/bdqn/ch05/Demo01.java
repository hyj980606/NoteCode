package bdqn.ch05;

import java.util.Scanner;

/**
 * @ClassName Demo01
 * @Description                 循环
 * @Author hyj
 * @Date 2022-07-11 14:48
 * @Version 1.0
 */

public class Demo01 {
    public static void main(String[] args) {

        /*System.out.println("行驶1公里");
        System.out.println("行驶2公里");
        System.out.println("行驶3公里");
        System.out.println("行驶4公里");
        System.out.println("行驶5公里");
        System.out.println("行驶6公里");
        System.out.println("行驶7公里");
        System.out.println("行驶8公里");
        System.out.println("行驶9公里");
        System.out.println("行驶10公里");*/

        //重复做的一件事情，可以选择使用循环
        /*int i = 1;
        while (i <= 100){
            System.out.println("行驶第" + i + "公里");
            i++;
        }*/

        Scanner input = new Scanner(System.in);
        System.out.println("是否正常营业：");
        String answer = input.next();
        while(answer.equals("y")){
            System.out.println("正常营业配餐");
            System.out.println("正常营业吗？");
            answer = input.next();
        }
        System.out.println("营业结束");
    }
}
