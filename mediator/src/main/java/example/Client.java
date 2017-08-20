package example;

/**
 * @autor wensen on 2017/8/20.
 */
public class Client {
    public static void main(String[] args) {
        //1. 创建中介者对象--主板对象
        MotherBoard motherBoard = new MotherBoard();
        //2. 创建同事类
        CDDriver cdDriver = new CDDriver(motherBoard);
        CPU cpu = new CPU(motherBoard);
        VideoCard videoCard = new VideoCard(motherBoard);
        SoundCard soundCard = new SoundCard(motherBoard);

        //3. 让中介者知道所有同事的事
        motherBoard.setCdDriver(cdDriver);
        motherBoard.setCpu(cpu);
        motherBoard.setVideoCard(videoCard);
        motherBoard.setSoundCard(soundCard);

        //4. 开始看电影，把光盘放入光驱，光驱开始读光盘
        cdDriver.readCD();

    }
}
