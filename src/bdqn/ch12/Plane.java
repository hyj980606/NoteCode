package bdqn.ch12;

/**
 * @ClassName Plane
 * @Description 一个飞机
 * @Author hyj
 * @Date 2022-07-22 13:57
 * @Version 1.0
 */

public class Plane {
    String color;

    public void moveLeft() {
        System.out.println("向左移动5个单位");
    }

    public void moveRight() {
        System.out.println("向右移动5个单位");
    }

    //int String double char boolean 数组 都是需要返回值的
    public int launch() {
        int random=(int)(Math.random()*1000)+1;
        //需要返回int类型数据
        return random;
    }

}
