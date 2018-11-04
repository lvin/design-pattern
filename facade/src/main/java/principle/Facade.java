package principle;

import principle.impl.AModuleImpl;
import principle.impl.BModuleImpl;
import principle.impl.CModuleImpl;

/**
 * Created by wensen on 2017/4/10.
 */
public class Facade {
    public void test() {
        AModuleApi aModuleApi = new AModuleImpl();
        aModuleApi.testA();

        BModuleApi bModuleApi = new BModuleImpl();
        bModuleApi.testB();

        CModuleApi cModuleApi = new CModuleImpl();
        cModuleApi.testC();
    }
}
