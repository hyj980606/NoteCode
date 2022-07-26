package bdqn.ch14.gifBiz;

import java.nio.file.LinkPermission;
import java.util.Scanner;

/**
 * @ClassName TestGifBiz
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-26 16:31
 * @Version 1.0
 */

public class TestGifBiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        GifBus gifBus=new GifBus();

        for (int i = 0; i < 3; i++) {

            GifBiz gifBiz = new GifBiz();

            System.out.print("请输入名称：");
            gifBiz.name = input.next();
            System.out.print("请输入价格：");
            gifBiz.price = input.nextDouble();
            System.out.print("请输入产地：");
            gifBiz.place = input.next();
            gifBus.setAdd(gifBiz);

        }

        gifBus.getGif();//调用显示方法数组
        //gifBiz.shows();
    }
}
