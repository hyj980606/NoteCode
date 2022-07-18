package bdqn.ch07;

import java.util.Scanner;

/**
 * @ClassName Demo03
 * @Description 数组求最值
 * @Author hyj
 * @Date 2022-07-18 14:18
 * @Version 1.0
 */

public class Demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i=0; i<nums.length; i++){
            System.out.println("请输入第"+(i+1)+"个数字");
            nums[i] = input.nextInt();
        }
        int max =0;
        for (int i=0; i< nums.length; i++){
            if (nums[max]<nums[i]){
                max=i;
            }
        }
        System.out.println(nums[max]);
    }
}
