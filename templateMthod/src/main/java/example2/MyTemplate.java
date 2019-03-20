package example2;

/**
 * @author wensen
 * @since 2019-03-20
 */
public class MyTemplate {
    public void myTemplateMethod(TemplateMethodCallback callback) {
        callback.method1();

        callback.method2();

        callback.method3();
    }
}
