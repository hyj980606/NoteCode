package bdqn.ch07;

import java.util.Scanner;

/**
 * @ClassName Demo04
 * @Description
 * @Author hyj
 * @Date 2022-07-18 14:26
 * @Version 1.0
 */

public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] cards=new int[] {13,11,10,7,6,4,0};
        System.out.println("原扑克点数：");
        for (int i=0; i< cards.length;i++){
            System.out.println(cards[i]+"\t");
        }
        int index = cards.length;   //存储插入位置
        System.out.println("请输入新插入扑克点数：");
        int insertNum = input.nextInt();
        for (int i=0; i< cards.length;i++){
            if (insertNum>cards[i]){
                index=i;
                break;
            }
        }

        //把7的位置空出来
        //循环移动位置，插入为位置后元素依次后移
        for (int i= cards.length-1; i>=index;i--){
            cards[i]=cards[i-1];
        }

        //插入数据
        cards[index] = insertNum;
        System.out.println("现扑克点数位置：");
        for (int i=0; i< cards.length; i++){
            System.out.println(cards[i]+"\t");
        }
    }
}