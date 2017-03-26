package example2;

/**
 */
public class RequestModel {

    /**
     * 具体的业务类型
     */
    private String type;

    /**
     * 通过构造方法把具体的e业务类型专递进来
     * @param type
     */
    public RequestModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
