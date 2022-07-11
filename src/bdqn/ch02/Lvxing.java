package bdqn.ch02;

import java.util.Scanner;

/*
*
*
* */
public class Lvxing {
    public static void main(String[] args) {
//       从控制台输入A团和B团费用
        Scanner input = new Scanner(System.in);
        System.out.print("请输入A团费用：");
        int a = input.nextInt();
        System.out.print("请输入B团费用：");
        int b = input.nextInt();

        boolean result1 = a > b;
        System.out.println("A团费用>B团吗：" + result1);

        boolean result2 = a < b;
        System.out.println("A团费用<B团吗：" + result2);

        boolean result3 = a <= b;
        System.out.println("A团收费<=B团吗？" + result3);

        boolean result4 = a >= b;
        System.out.println("A团收费>=B团吗？" + result4);

        boolean result5 = a == b;
        System.out.println("A团收费等于B团吗？" + result5);

        boolean result6 = a != b;
        System.out.println("A团收费与B团不相同吗？" + result6);
    }
}
