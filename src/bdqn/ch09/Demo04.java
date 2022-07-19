package bdqn.ch09;

import java.util.Scanner;

/**
 * @ClassName Demo04
 * @Description 求最值
 * @Author hyj
 * @Date 2022-07-19 14:20
 * @Version 1.0
 */

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.print("请输入第"+(i+1)+"战队得分：");
            arr[i] = input.nextInt();
        }

        int max=0;
        for (int j=0; j<arr.length;j++){
            if (arr[max] < arr[j]) {
                max=j;
            }
        }
        System.out.println("第"+(max+1)+"战队获胜");
    }
}
