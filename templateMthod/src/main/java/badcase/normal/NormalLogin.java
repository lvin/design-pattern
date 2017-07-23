package badcase.normal;

/**
 * @autor wensen on 2017/7/23.
 */
public class NormalLogin {

    /**
     * 1.从数据库获取的登录人员的信息，就是根据用户编号去获取人员的数据
     * @param lm
     * @return
     */
    public boolean Login(LoginModel lm) {
        //1. 从数据库获取人员的信息，就是根据用户编号去获取人员的数据
        UserModel um = this.findUserByUserId(lm.getUserId());
        //2. 判断从前台传递过来的登录数据和数据库中已经有的数据是否匹配
        //先判断用户是否存在，如果um为null，说明用户肯定不存在
        //但是不为null，用户不一定存在，因为数据层可能返回new UserModel
        //因此还需要进一步的判断
        if (um != null) {
            //如果用户存在，检查用户编号和密码是否匹配
            if (um.getUserId().equals(lm.getUserId())
                    && um.getPwd().equals(lm.getPwd())) {
                return true;
            }
        }

        return false;

    }

    private UserModel findUserByUserId(String userId) {
        UserModel um = new UserModel();
        um.setUserId(userId);
        um.setName("test");
        um.setPwd("test");
        um.setUuid("User0001");
        return um;
    }

}
