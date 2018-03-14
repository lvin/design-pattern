package demo;

/**
 * @author wensen
 * @since 14/03/2018
 */
public class Client {
    public static void main(String[] args) {
        //先创建计算基本奖金的类，这也是被装饰的对象
        Component c1 = new ConcreteComponent();

        Decorator d1 = new MonthPrizeDecorator(c1);

        d1.calcPrize("张三", null, null);
    }
}
