package bdqn.ch14.calPrice;

import java.util.Scanner;

/**
 * @ClassName TestCalPrice
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-26 15:21
 * @Version 1.0
 */

public class TestCalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CalPrice calPrice = new CalPrice();

        double[]moneys=new double[5];
        System.out.println("请输入商品价格：");
        for (int i=0;i< moneys.length;i++){
            moneys[i] = input.nextDouble();
        }

        double avg = calPrice.getAvg(moneys);
        System.out.println(avg);

        double sum = calPrice.getSum(moneys);
        System.out.println(sum);


        double max = calPrice.getMax(moneys);
        System.out.println(max);
    }
}
