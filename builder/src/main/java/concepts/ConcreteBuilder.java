package concepts;

/**
 * 具体的生成器实现对象
 * Created by wensen on 2017/4/16.
 */
public class ConcreteBuilder implements Builder {

    /**
     * 生成器最终构建的产品对象
     */
    private Product resultProduct;

    /**
     * 获取生成器最终构建的产品对象
     * @return
     */
    public Product getResult() {
        return resultProduct;
    }

    public void buildPart() {
        //构建某个部件的功能处理
    }
}
