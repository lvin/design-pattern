package principle;

/**
 * 具体的聚合对象，实现创建相应迭代器对象的功能
 * @author wensen
 * @since 2018/9/11
 */
public class ConcreteAggregate extends Aggregate{

    /**
     * 示意，表示聚合对象具体的内容
     */
    private String[] ss = null;

    /**
     * 构造方法，传入聚合对象具体的内容
     * @param ss 聚合对象具体的内容
     */
    public ConcreteAggregate(String[] ss) {
        this.ss = ss;

    }

    @Override
    public Iterator createIterator() {
        //实现创建Iterator的工厂方法
        return new ConcreteIterator(this);
    }

    /**
     * 获取索引所对应的元素
     * @param index
     * @return
     */
    public Object get(int index) {
        Object retObj = null;
        if (index < ss.length) {
            retObj = ss[index];
        }

        return retObj;
    }

    /**
     * 获取聚合对象的大小
     * @return
     */
    public int size() {
        return this.ss.length;
    }

}
