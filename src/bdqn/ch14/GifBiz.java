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

    /**
     * 查找纪念品
     * @param start 开始位置
     * @param end   结束位置
     * @param name  查找纪念品名称
     * @return  找到为true未找到false
     */
    public boolean searchGif(int start,int end,String name){
        boolean flag=false;
        for (int i=start-1;i<end;i++){
            if (names[i].equals(name)){
                flag=true;
                break;
            }
        }
        return flag;
    }

}
