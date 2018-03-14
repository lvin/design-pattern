package principle;

/**
 * @autor wensen on 2017/7/16.
 */
public class Decorator extends Component {

    /**
     * 持有组件对象
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        //转发请求给组件对象，可以在转发前后执行一些附加的动作
        component.operation();
    }
}
