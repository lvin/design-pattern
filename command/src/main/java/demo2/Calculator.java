package demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算器类，计算器上有加法按钮、减法按钮
 * @author wensen
 * @since 12/03/2018
 */
public class Calculator {

    /**
     * 持有执行加法的命令对象
     */
    private Command addCmd = null;

    private Command substractCmd = null;

    /**
     * 命令的操作的历史记录，在撤销的时候用
     */
    private List<Command> undoCmds = new ArrayList<Command>();

    public Command getAddCmd() {
        return addCmd;
    }

    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    public Command getSubstractCmd() {
        return substractCmd;
    }

    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }

    public void addPressed() {
        addCmd.execute();
        //把操作记录到历史记录里面
        undoCmds.add(addCmd);
    }

    public void substractPressed() {
        this.substractCmd.execute();
        undoCmds.add(substractCmd);
    }

    public void undoPressed() {
        if (undoCmds.size() > 0) {
            //取出最后一个命令来撤销
            Command cmd = undoCmds.get(undoCmds.size() - 1);
            cmd.undo();
            this.undoCmds.remove(cmd);
        } else {
            System.out.println("没有可撤销的命令");
        }

    }


}
