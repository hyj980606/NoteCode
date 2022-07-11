package bdqn.ch05;

/**
 * @ClassName Demo03
 * @Description 20以内所有能被3整除的数之和
 * @Author hyj98
 * @Date 2022-07-11 15:26
 * @Version 1.0
 */

public class Demo03 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 20){
            if (i % 3 == 0){
                System.out.println(i);
                sum = i + sum;      //sum+=i;
            }
            i++;
        }
        System.out.println("20以内所有能被3整除的数之和：" + sum);
    }
}
