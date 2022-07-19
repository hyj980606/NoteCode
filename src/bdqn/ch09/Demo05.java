package bdqn.ch09;

import java.nio.file.LinkPermission;
import java.util.Scanner;

/**
 * @ClassName Demo05
 * @Description
 * @Author hyj
 * @Date 2022-07-19 15:03
 * @Version 1.0
 */

public class Demo05 {
    public static void main(String[] args) {
        //定义数组保存各组分数
        int[] score = new int[3];
        //定义数组保存各战队赢的次数
        int[] result  = new int[3];
        //最高成绩
        int max = 0;
        Scanner input = new Scanner(System.in);
        for (int i=0; i<5; i++){
            max=0;
            System.out.println("********星际英雄赛事第"+(i+1)+"轮********");
            for (int j=0; j<score.length; j++){
                System.out.print("请输入第"+(j+1)+"战队得分：");
                score[j] = input.nextInt();
            }
            for (int n=0; n< score.length; n++){
                if (score[max]<score[n]){
                    max=n;
                }
            }
            System.out.println("第"+(max+1)+"战队获胜");
            result[max]++;
        }
        System.out.println("****最终结果****");
        for (int i=0;i< result.length;i++){
            System.out.println("第"+(i+1)+"轮战队并胜出"+result[i]+"轮");
        }
    }
}
