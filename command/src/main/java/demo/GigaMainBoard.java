package demo;

/**
 * 技嘉主板类，开机命令真正
 * @autor wensen
 * @since 2018/1/22
 */
public class GigaMainBoard implements MainBoardApi{

    /**
     * 真正的开机命令的实现
     */
    public void open() {
        System.out.println("open");
    }

    /**
     * 真正的重新启动机器命令的实现
     */
    public void reset() {
        System.out.println("reset");
    }

}
