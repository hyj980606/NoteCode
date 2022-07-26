package bdqn.ch14.gifBiz;

/**
 * @ClassName GifBus
 * @Description TODO
 * @Author hyj
 * @Date 2022-07-26 16:26
 * @Version 1.0
 */

public class GifBus {
    //l对象定义为数组
    GifBiz[] gifBizs=new GifBiz[3];

    public void setAdd(GifBiz gifbiz){
        for (int i=0;i< gifBizs.length;i++){
            if (gifBizs[i]==null){
                gifBizs[i]=gifbiz;
                break;
            }
        }
    }

    //显示信息
    public void getGif(){
        for (int i = 0; i < gifBizs.length; i++) {
            gifBizs[i].shows();
        }
    }

}
