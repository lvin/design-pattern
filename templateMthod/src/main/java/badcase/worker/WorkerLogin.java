package badcase.worker;


/**
 * 工作人员登录控制的逻辑处理
 * @autor wensen on 2017/7/23.
 */
public class WorkerLogin {
    /**
     * 判断登录是否正确，也就是是否能登录成功
     * @param loginModel
     * @return
     */
    public boolean login(LoginModel loginModel) {
        //1.根据工作人员编号去获取工作人员的数据
        WorkerModel wm = findWorkerByWorkerId(loginModel.getWorkerId());
        //2. 判断从前台传递过来的用户名和加密后的密码数据，和数据库中已有的数据是否匹配
        //先判断工作人员是否存在，如果wm为null,说明工作人员肯定不存在
        //但是不为null，工作人员不一定存在
        //因为数据层有可能返回new WorkerModel();因此还需要做进一步的判断
        if (wm != null) {
            //3.把从前台传来的密码数据使用相应的加密算法进行加密运算
            String encryptPwd = this.encryptPwd(loginModel.getWorkerId());
            //如果工作人员存在，检查工作人员编号和密码是否匹配
            if (wm.getWorkerId().equals(loginModel.getWorkerId())
                    && wm.getPwd().equals(encryptPwd)) {
                return true;
            }
        }

        return false;
    }

    private String encryptPwd(String pwd) {
        return pwd;
    }
    /**
     * 根据工作人员编号获取工作人员的信息
     * @param workerId
     * @return
     */
    private WorkerModel findWorkerByWorkerId(String workerId) {
        WorkerModel wm = new WorkerModel();
        wm.setWorkerId(workerId);
        wm.setName("Worker1");
        wm.setPwd("worker1");
        wm.setUuid("Worker00001");

        return wm;
    }

}
