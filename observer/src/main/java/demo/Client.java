package demo;

/**
 * @author wensen
 * @since 2018/4/10
 */
public class Client {
    public static void main(String[] args) {
        //创建一个报纸，作为被观察者
        NewsPaper subject = new NewsPaper();

        //创建阅读者，也就是观察者
        Reader reader1 = new Reader();
        reader1.setName("reader1");

        Reader reader2 = new Reader();
        reader2.setName("reader2");

        Reader reader3 = new Reader();
        reader3.setName("reader3");

        //注册订阅者
        subject.attach(reader1);
        subject.attach(reader2);
        subject.attach(reader3);

        //要出报纸啦
        subject.setContent("本期的内容是观察者模式");
    }
}
