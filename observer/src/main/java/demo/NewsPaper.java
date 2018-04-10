package demo;

/**
 * @author wensen
 * @since 2018/4/10
 */
public class NewsPaper extends Subject{

    /**
     * 报纸的具体内容
     */
    private String content;

    /**
     * 获取报纸的内容
     * @return
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        //内容有了，说明又出报纸了，那就通知所有的读者
        notifyObservers();
    }
}
