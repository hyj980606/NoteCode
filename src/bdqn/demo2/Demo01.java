package bdqn.demo2;

import java.util.Scanner;

/*
逻辑运算符：
    &&：短路与（两个操作数都是true，结果才是true）
    ||：短路或（两个操作数一个是true，结果才是true）
    ！：非（操作数为true，结果为false；操作数为false，结果为true）


* if选择表达式：
* 1、简单if结构
*   if(条件) {
*     代码块;
*   }
* 2、复杂if选择结构

* */
public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入旅行预算：");
        int money = input.nextInt();
        System.out.print("请输入身体状况：");
        String name = input.next();
        /*if (money>=1000) {
            System.out.println("可以去旅行");
        }*/
        if (money>=1000 && name.equals("优秀")||(money>=1200&&name.equals("良好"))){
            System.out.println("可以去旅行");
        }
    }
}
