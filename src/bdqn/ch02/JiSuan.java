package bdqn.ch02;

public class JiSuan {
    public static void main(String[] args) {
/*
* 自增和自减
* */
        int num1 =10;
        int num2 = 20;
        int result1 = (num1++) + num2;
        System.out.println(num1);
        System.out.println(result1);

        /*
        * 类型转换：
        * 一、自动类型转换规则
        *   规则1：如果一个操作数为double型，则整个表达式可提升为double
        *   规则2：满足自动类型转换的条件
        *    两种类型要兼容
        *       数值类型（整型和浮点型）相互兼容
        *    目标类型大于原类型：
        *       例如：double型大于int型
        * 二、强制类型转换规则：
        *   当目标类型取值范围小于原类型是，Java不会进行类型转换,需要进行强制类型转换
        * 强制类型转换语法：
        *   （类型名）表达式
        * */
        double money = 1325.5;
        int discount = 100;
        double result2 = money - discount;
        System.out.println("实际支付：" + result2);

        int num3 = 20;
        double num4 = 6.9;
        int result3 = (int) (num3 + num4);
        System.out.println("今年酒店入住率是" + result3 + "%");
    }
}
