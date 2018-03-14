package badcase;

/**
 * @author wensen
 * @since 14/03/2018
 */
public class Client {
    public static void main(String[] args) {
        //先创建爱你计算奖金的对象
        Prize p = new Prize();

        //日期对象都没有用上，所以传null就可以了
        double zs = p.clacPrize("张三", null, null);
        System.out.println("张三奖金:"+zs);
    }
}
