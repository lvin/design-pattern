package demo2;

/**
 * @author wensen
 * @since 12/03/2018
 */
public interface OperationApi {

    /**
     * 获取计算完成后的结果
     * @return
     */
    public int getResult();

    /**
     * 设置计算开始的初始值
     * @param result
     */
    public void setResult(int result);

    /**
     * 执行加法
     * @param num
     */
    public void add(int num);

    /**
     * 执行减法
     * @param num
     */
    public void substract(int num);
}
