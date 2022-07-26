package bdqn.ch14.calPrice;

/**
 * @ClassName CalPrice
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-26 15:19
 * @Version 1.0
 */

public class CalPrice {

    //总钱数
    double sum;

    //平均价格
    double avg;

    //计算平均值
    public double getAvg(double[] moneys){
        for (int i=0;i< moneys.length;i++){
            sum+=moneys[i];
        }
        avg=sum/moneys.length;
        return avg;
    }

    //求和
    public double getSum(double[] moneys){
        for (int i=0;i< moneys.length;i++){
            sum+=moneys[i];
        }
        return sum;
    }
}
