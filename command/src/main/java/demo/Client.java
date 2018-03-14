package demo;

/**
 * @autor wensen
 * @since 2018/1/22
 */
public class Client {
    public static void main(String[] args) {

        MainBoardApi mainBoard = new GigaMainBoard();

        OpenCommand openCommand = new OpenCommand(mainBoard);

        Box box = new Box();

        box.setOpenCommand(openCommand);

        box.openButtonPressed();
    }
}
