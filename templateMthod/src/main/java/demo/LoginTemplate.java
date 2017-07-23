package demo;

/**
 * 登录控制的模板
 * @autor wensen on 2017/7/23.
 */
public abstract class LoginTemplate {

    public final boolean login(LoginModel lm) {
        // 1.根据登录人员的编号去获取相应的数据
        LoginModel dblm = this.findLoginUser(lm.getLoginId());

        if (dblm != null) {
            //2;对数据进行加密
            String encryptPwd = this.encryptPwd(lm.getPwd());
            //把加密后的密码设置回到登录数据模型中
            lm.setPwd(encryptPwd);
            //3.判断是否匹配
            return this.match(lm, dblm);

        }

        return false;
    }

    /**
     * 根据登录编号来查找和获取存储中相应的数据
     * @param loginId
     * @return
     */
    public abstract  LoginModel findLoginUser(String loginId);

    /**
     * 对密码进行加密
     * @param pwd
     * @return
     */
    public String encryptPwd(String pwd) {
        return pwd;
    }

    /**
     * 判断用户填写的登录数据和存储中对应的数据是否匹配的上
     * @param lm
     * @param dblm
     * @return
     */
    public boolean match(LoginModel lm, LoginModel dblm) {
        if (lm.getLoginId().equals(dblm.getLoginId())
                && lm.getPwd().equals(dblm.getPwd())) {
            return true;
        }

        return false;
    }


}
