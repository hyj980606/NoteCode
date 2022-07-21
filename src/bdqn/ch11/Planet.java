package bdqn.ch11;

/**
 * @ClassName Planet
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-21 15:03
 * @Version 1.0
 */

public class Planet {
    public String name;//名称
    public int diameter;//直径
    public int rotationDay;//自转周期
    public int revolution;//公转周期
    public String remark;//简述

    //自转
    public void rotation(){
        System.out.println(name+"自转一周需要："+rotationDay);
    }

    //公转
    public void revolution(){
        System.out.println(name+"公转一周需要："+revolution);
    }

    //输出信息
    public void show() {
        System.out.println("名称："+name+"直径："+diameter+"自转周期："+rotationDay+"公转周期："+revolution);
        System.out.println("简述："+remark);
    }
}
