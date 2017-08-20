package example;

/**
 * @autor wensen on 2017/8/20.
 */
public class MotherBoard implements Mediator{

    private CDDriver cdDriver = null;

    private CPU cpu = null;

    private VideoCard videoCard = null;

    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void changed(Colleague colleague) {
        if (colleague == cdDriver) {
            //表示光驱读取数据
            this.opeCDDriverReadData((CDDriver) colleague);
        } else if (colleague == cpu) {
            //表示cpu处理完了
            this.opeCPU((CPU) colleague);
        }
    }

    /**
     * 处理光驱读取数据以后与其他对象的交互
     * @param cdDriver
     */
    private void opeCDDriverReadData(CDDriver cdDriver) {
        //1.先获取光驱读取的数据
        String data = cdDriver.getData();

        //2. 再把这些数据传递给CPU进行处理
        this.cpu.executeData(data);
    }

    /**
     * 处理CPU处理完数据后与其他对象的交互
     *
     * @param cpu
     */
    private void opeCPU(CPU cpu) {
        //1. 先获取CPU处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();

        //2. 把这些数据传递给显卡和声卡展示出来
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);

    }

}

