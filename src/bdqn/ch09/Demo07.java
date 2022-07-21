package bdqn.ch09;

import java.util.Scanner;

/**
 * @ClassName Demo07
 * @Description
 * @Author hyj
 * @Date 2022-07-19 17:15
 * @Version 1.0
 */

public class Demo07 {
    public static void main(String[] args) {
        int sum=0;
        int num=0;
        Scanner input = new Scanner(System.in);
        System.out.println("******人气游记统计******");
        for (int i=1; i<=3; i++){
            num=0;
            System.out.println("**"+i+"月**");
            for (int j=1; j<=5; j++){
                System.out.print("请输入第"+j+"篇游记点赞数：");
                int number = input.nextInt();
                if (number>=300){
                    num++;
                }
                if (num==3){
                    System.out.println("本月人气游记以达到3篇,统计截至");
                    sum++;
                    break;
                }
            }
        }
        System.out.println("*****统计结果******");
        System.out.println("您获得逍遥虾勋章"+sum+"枚，恭喜！");
    }
}
