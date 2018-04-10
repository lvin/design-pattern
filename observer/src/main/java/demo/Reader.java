package demo;

/**
 * @author wensen
 * @since 2018/4/10
 */
public class Reader implements Observer{

    /**
     * 读者的姓名
     */
    private String name;

    @Override
    public void update(Subject subject) {
        //这是采用拉的方式
        System.out.println(name + "报纸收到了,阅读它。内容是==" + ((NewsPaper) subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
