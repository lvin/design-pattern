package example2;

/**
 * @author wensen
 * @since 2019-03-20
 */
public class TemplateMethodExample2 {
    public static void main(String[] args) {
        MyTemplate myTemplate = new MyTemplate();

        myTemplate.myTemplateMethod(new TemplateMethodCallback() {
            public void method1() {
                System.out.println("method1");
            }

            public void method2() {
                System.out.println("method2");

            }

            public void method3() {
                System.out.println("method3");
            }
        });
    }
}
