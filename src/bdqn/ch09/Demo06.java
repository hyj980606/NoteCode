package bdqn.ch09;

import java.util.Scanner;

/**
 * @ClassName Demo06
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-19 16:53
 * @Version 1.0
 */

public class Demo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        int sum=0;
        int number=15;
        for (int i=1; i<=3;i++){
            num=0;
            System.out.print("*****第"+i+"位游客采摘*****");
            System.out.print("\n请输入游客身高：");
            int height = input.nextInt();
            for (int j=1; j<=5; j++){

                int  random = (int) ((Math.random()*100)+101);
                if (random<=(height+30)){
                    System.out.println(j+".苹果高度："+random+"，摘到了！");
                    num++;
                }else {
                    System.out.println(j+".苹果高度："+random+"，太高了，摘不到");
                }
            }
            sum+=num;
            System.out.println("第"+i+"位游客摘到了苹果"+num+"个");
        }
        number=number-sum;
        System.out.println("书上还有"+number+"个苹果没有采摘！");
    }
}
