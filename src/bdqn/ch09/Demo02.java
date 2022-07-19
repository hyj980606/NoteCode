package bdqn.ch09;

/**
 * @ClassName Demo02
 * @Description
 * @Author hyj
 * @Date 2022-07-19 14:04
 * @Version 1.0
 */

public class Demo02 {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
