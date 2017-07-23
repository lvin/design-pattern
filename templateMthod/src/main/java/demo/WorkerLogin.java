package demo;

/**
 * @autor wensen on 2017/7/23.
 */
public class WorkerLogin extends LoginTemplate{
    public LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();

        lm.setLoginId(loginId);

        lm.setPwd("workerpwd");

        return lm;
    }

    public String encryptPwd(String pwd) {

        //覆盖父类的方法，提供真正的加密实现
        //这里对密码进行加密，比如使用MD5,3DES等，省略了
        System.out.println("使用MD5进行密码加密");
        return pwd;
    }
}
