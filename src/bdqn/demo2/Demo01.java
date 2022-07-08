package bdqn.demo2;

import java.util.Scanner;

/*

逻辑运算符：
    &&：短路与（两个操作数都是true，结果才是true）
    ||：短路或（两个操作数一个是true，结果才是true）
    ！：非（操作数为true，结果为false；操作数为false，结果为true）
条件运算符：
    表达式1？表达式2：表达式3;
    如果表达式1值为true，则返回表达式2的值；
    如果表达式1值为false，则返回表达式3的值。


* if选择表达式：
* 1、简单if结构
*   if(条件) {
*     代码块;      //如果布尔表达式的值位true
*   }
* 2、if-else选择结构
    if语句后面可以跟else语句，当if语句的布尔表达式值位false时，else代码块会被执行。
    if(布尔表达式){
        //如果布尔表达式的值为true
    }else{
        //如果布尔表达式的值为false
    }

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
        }else {
            System.out.println("争取下次旅行机会");
        }
    }
}
