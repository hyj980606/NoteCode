package bdqn.ch11;

import java.util.Scanner;

/**
 * @ClassName PlanetTest
 * @Description
 * @Author hyj
 * @Date 2022-07-21 15:10
 * @Version 1.0
 */

public class PlanetTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Planet planet = new Planet();

        String[] planets={"水星","金星","地球","火星","木星","天王星"};
        String num="";//选择是否继续输入
        String name;//行星名称
        boolean flag = false;//是否是行星
        System.out.println("******太阳系行星");
        do {
            do {
                System.out.print("请输入行星名称：");
                name= input.next();
                for (int i=0; i< planets.length; i++){
                    if (name.equals(planets[i])){
                        flag=true;
                        break;
                    }
                }
                if (flag){
                    break;
                }else {
                    System.out.println("你输入的有误。请重新输入！");
                }

            }while (true);

            planet.name=name;
            System.out.print("请输入行星简述：");
            planet.remark = input.next();
            System.out.print("请输入行星直径（千米）：");
            planet.diameter = input.nextInt();
            System.out.print("请输入公转周期（日）：");
            planet.rotationDay = input.nextInt();
            System.out.print("请输入自转周期（日）：");
            planet.revolution = input.nextInt();

            System.out.println("********"+name+"信息********");
            planet.show();
            planet.revolution();
            planet.rotation();

            System.out.print("是否继续录入（y/n）:");
            num = input.next();
        }while (num.equals("y"));
    }
}
