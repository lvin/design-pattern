package demo;

import java.util.Date;

/**
 * 计算奖金的组件接口
 * @author wensen
 * @since 14/03/2018
 */
public abstract class Component {

    /**
     * @param user
     * @param begin
     * @param end
     * @return
     */
    public abstract double calcPrize(String user, Date begin, Date end);
}
