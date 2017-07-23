package demo;

/**
 * @autor wensen on 2017/7/23.
 */

public class NormalLogin extends LoginTemplate{
    public LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testpwd");

        return lm;
    }


}
