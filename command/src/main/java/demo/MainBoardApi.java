package demo;

/**
 * 主板的接口
 * @autor wensen
 * @since 2018/1/22
 */
public interface MainBoardApi {

    /**
     * 主机具有能开机的功能
     */
    public void open();

    /**
     * 主板具有实现重启的功能
     */
    public void reset();
}
