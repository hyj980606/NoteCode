package bdqn.ch07;

import java.util.Scanner;

/**
 * @ClassName Demo01
 * @Description
 * @Author hyj
 * @Date 2022-07-15 15:56
 * @Version 1.0
 */

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //声明
        String[] names = new String[6];

        //循环输入蛋糕名称
        for (int i = 0; i< names.length;i++){
            System.out.print("请输入第"+(i+1)+"蛋糕名称:");
            names[i] = input.next();
        }
        //打印2~4蛋糕
        System.out.println("打印蛋糕名称：");
        for (int i = 1;i<=3;i++){
            System.out.println(names[i]);
        }
        /*//打印第四个蛋糕
        System.out.println(names[3]);*/

        /*names[0] = "草莓蛋糕";

        String[] names1;
        names1 = new String[6];
        names1[0] = "冰淇淋蛋糕";

        String[] names2 = {"a","b","c"};  */

    }
}
