package bdqn.demo2;


import java.util.Scanner;

/*
* 4、嵌套if选择结构
* 使用嵌套if...else语句是合法的。也就是说你可以在另一个if或者else if语句中使用if或者else if语句。
*   if(布尔表达式 1){
*       ////如果布尔表达式 1的值为true执行代码
*       if(布尔表达式 2){
*           ////如果布尔表达式 2的值为true执行代码
*       }
*   }
*
*
* */
public class Demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = input.nextInt();
        if (age >= 7 && age<= 60) {
            System.out.println("是否持证：");
            char result = input.next().charAt(0);
            if (result=='y'){
                System.out.println("可以深潜");
            }else {
                System.out.println("可以浮潜");
            }
        }else {
            System.out.println("您的年龄不允许潜水");
        }
    }
}
