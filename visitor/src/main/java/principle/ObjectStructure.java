package principle;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 对象结构，通常在这里对元素对象进行便利，让访问者能访问到所有的元素
 * @author wensen
 * @since 15/03/2018
 */
public class ObjectStructure {

    private Collection<Element> col = new ArrayList<Element>();

    public void handleRequest(Visitor visitor) {
        //循环对象中结构中的元素，接受访问
        col.stream().forEach(element -> element.accept(visitor));
    }

    /**
     * 示意方法，组件对象结构，向对象结构中添加元素
     * @param element
     */
    public void addElement(Element element) {
        this.col.add(element);
    }
}
