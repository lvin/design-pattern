package demo;

/**
 * @autor wensen on 2017/7/17.
 */
public class Proxy implements UserModelApi {
    /**
     * 持有被代理的具体的目标对象
     */
    private UserModel realSubject = null;

    public Proxy(UserModel realSubject, boolean loaded) {
        this.realSubject = realSubject;
        this.loaded = loaded;
    }

    private boolean loaded = false;

    public String getUserId() {
        return realSubject.getUserId();
    }


    public String getDepId() {
        //需要判断是否已经装载过了
        if (!this.loaded) {
            //从数据库中重新装载

            //设置重新装载标志为true
            this.loaded = true;
        }

        return realSubject.getDepId();
    }

    public String getSex() {
        if (!this.loaded) {
            this.loaded = true;
        }

        return realSubject.getSex();
    }

    public void setUserId(String userId) {

    }

    public String getName() {
        return null;
    }

    public void setName(String name) {

    }

    public void setDepId(String depId) {

    }

    public void setSex(String sex) {
        realSubject.setSex(sex);
    }
}
