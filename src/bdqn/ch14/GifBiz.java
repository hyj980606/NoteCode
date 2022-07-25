package bdqn.ch14;

/**
 * @ClassName GifBiz
 * @Description
 * @Author hyj
 * @Date 2022-07-25 16:18
 * @Version 1.0
 */

public class GifBiz {
    //保存
    String[] names=new String[5];

    public void add(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    public void show(){
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
