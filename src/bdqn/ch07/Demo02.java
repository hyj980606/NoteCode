package bdqn.ch07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Demo02
 * @Description 数组排序
 *              语法格式
 *                  Arrays.sort(数组名);
 *              Java中只有从小到大排序的方法，没有从大到小的排序方法
 * @Author hyj
 * @Date 2022-07-18 13:49
 * @Version 1.0
 */

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i=0; i<nums.length; i++){
            System.out.println("请输入第"+(i+1)+"个数字");
            nums[i] = input.nextInt();
        }
        //数组排序，从小到大排序
        Arrays.sort(nums);

        //数字从小到大显示
        System.out.println("从小到大显示：");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"\t");
        }

        //从大到小排序
        System.out.println("从大到小显示：");
        for (int i=nums.length-1;i>0;i--){
            System.out.print(nums[i]+"\t");
        }
    }
}
