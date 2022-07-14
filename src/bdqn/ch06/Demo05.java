package bdqn.ch06;

/**
 * @ClassName Demo05
 * @Description continue作用
 *                  适用于任何循环控制结构中用是让程序立刻跳转到下一次循环的迭代。
 *                  在for循环中，continue语句使程序立即跳转到更新语句。
 *                  在while或者do...while循环中，程序立即跳转到布尔表达式的判断语句
 * @Author hyj
 * @Date 2022-07-14 14:51
 * @Version 1.0
 */

public class Demo05 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            if (i==3){
                System.out.println("电力不足，需要充电");
                continue;
            }
            System.out.println("第"+i+"周");
        }
    }
}
