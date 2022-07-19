package bdqn.ch09;

/**
 * @ClassName Demo01
 * @Description 多重for循环
 *                  注意：
 *                      个循环可相互嵌套
 *                      一般不超过三层
 *                      外层循环变量变化一次，内层循环变量要变化一遍
 *              一个循环体内又包含其他完整的循环结构称为多重循环
 * @Author hyj
 * @Date 2022-07-19 13:51
 * @Version 1.0
 */

public class Demo01 {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++){
            for (int j=1; j<=9; j++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
