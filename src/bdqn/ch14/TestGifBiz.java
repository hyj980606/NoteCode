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

        System.out.print("请输入开始查找位置：");
        int start = input.nextInt();
        System.out.print("请输入结束位置：");
        int end = input.nextInt();
        System.out.print("请输入纪念品名称：");
        String name = input.next();

        boolean flag = gifBiz.searchGif(start, end, name);
        if (flag){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
    }
}
