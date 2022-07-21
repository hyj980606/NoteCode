package bdqn.ch11;

/**
 * @ClassName TestMonkey
 * @Description
 * @Author hyj
 * @Date 2022-07-21 14:11
 * @Version 1.0
 */

public class TestMonkey {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.name="乔治";
        monkey.type="狐猴";
        monkey.color="灰色";
        monkey.tailLength=20;

        monkey.jump();//跳
        monkey.clmd();//爬
        monkey.show();//显示信息
    }
}
