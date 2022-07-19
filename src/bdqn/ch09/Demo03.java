package bdqn.ch09;

import javax.swing.*;

/**
 * @ClassName Demo03
 * @Description 九九乘法表
 * @Author hyj
 * @Date 2022-07-19 14:09
 * @Version 1.0
 */

public class Demo03 {
    public static void main(String[] args) {
        for (int i=1; i<=9;i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println("");
        }
    }
}
