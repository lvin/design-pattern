package example;


/**
 * @autor wensen on 2017/8/20.
 */
public class VideoCard extends Colleague{
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("您正在观看的是:" + data);
    }
}


