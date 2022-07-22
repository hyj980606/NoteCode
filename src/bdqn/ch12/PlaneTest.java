package bdqn.ch12;

/**
 * @ClassName PlaneTest
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-22 14:01
 * @Version 1.0
 */

public class PlaneTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.moveLeft();
        plane.moveRight();
        int num=plane.launch();
        System.out.println("发射子弹"+num);
    }
}
