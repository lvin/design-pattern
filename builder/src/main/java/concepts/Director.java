package concepts;

/**
 * 指导者，指导使用生成器的接口来构建产品的对象
 * Created by wensen on 2017/4/16.
 */
public class Director {

    /**
     * 持有当前需要使用的生成器对象
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        //通过使用生成器接口来构建最终的产品对象
        builder.buildPart();
    }
}

