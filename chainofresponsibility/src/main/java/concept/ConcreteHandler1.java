package concept;

/**
 * 具体的职责对象，用来处理请求
 */
public class ConcreteHandler1 extends Handler{

    public void handlerRequest() {
        /**
         * 根据某些条件判断是否属于自己的处理范围，
         * 某些条件比如，从外部传入的参数，或是这里主动去获取的外部参数
         * 入从数据库获取等，下面这句话仅供参考
         */
        boolean someCondition = false;

        if (someCondition) {
            //如果属于自己的职责范围，就在这里处理请求
            //具体的处理代码
            System.out.println("concept.ConcreteHandler1 handler request");
        } else {
            //如果不属于自己的职责处理范围，那就判断是否有后继的职责对象
            //如果有就发请求给h后继的职责对象
            //如果没有，什么都不做，自然结束
            if (null != this.successor) {
                this.successor.handlerRequest();
            }
        }

    }
}
