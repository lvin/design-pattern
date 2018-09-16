package principle;

/**
 * @author wensen
 * @since 2018/9/11
 */
public interface Iterator {

    /**
     * 移动到聚合对象的带个位置
     */
    public void first();

    /**
     * 移动到聚合对象的下一个位置
     */
    public void next();

    /**
     * 判断是否已经移动到聚合对象的最后一个位置
     * @return true 表示已经移动到聚合对象的最后一个位置
     * false表示还没有移动到聚合对象的最后一个位置
     */
    public boolean isDone();

    /**
     * 获取迭代的当前元素
     * @return
     */
    public Object currentItem();
}
