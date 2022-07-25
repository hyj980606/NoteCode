package bdqn.ch14;

import java.util.Scanner;

/**
 * @ClassName TestGifBiz
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-25 16:33
 * @Version 1.0
 */

public class TestGifBiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GifBiz gifBiz = new GifBiz();
        for (int i=1; i<=5; i++){
            System.out.print("请输入第"+i+"个纪念品名称：");
            String name = input.next();
            gifBiz.add(name);
        }

        gifBiz.show();
    }
}
