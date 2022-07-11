package bdqn.ch03;


import java.util.Scanner;

/*
* 3、多重if选择结构
*   if(条件1){
*       代码块1;
*   }else if(条件2){
*       代码块2;
*   }else{
*       代码块3;
*   }
* 注：如果多重if选择结构中所有的条件之间只是简单的互斥，不存在连续区间的关系，则条件没有顺序要求
*
* */
public class Demo02 {
    public static void main(String[] args) {
        //从控制台输入
        Scanner input = new Scanner(System.in);
        System.out.print("请输入摄氏度：");
        int sheshi = input.nextInt();

        if (sheshi < 5){
            System.out.println("穿羽绒服");
        } else if (sheshi >= 5 && sheshi <15){
            System.out.println("穿夹克衫");
        }else if (sheshi >= 15 && sheshi <25){
            System.out.println("薄牛仔");
        }else {
            System.out.println("短袖");
        }
    }
}
