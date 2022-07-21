package bdqn.ch11;

/**
 * @ClassName Monkey
 * @Description
 * @Author hyj
 * @Date 2022-07-21 14:01
 * @Version 1.0
 */

public class Monkey {
    //属性和方法
    String name;    //名称
    String type;//种类
    String color;//颜色
    int tailLength;//尾长

    //跳跃方法
    public void jump(){
        System.out.println("小猴子"+name+"正在跳跃");
    }

    //爬树
    public void clmd(){
        System.out.println("小猴子"+name+"正在爬树");
    }

    //显示信息
    public void show() {
        System.out.println("小猴子名称："+name+"种类："+type+"颜色："+color+"尾长:"+tailLength);
    }

}
