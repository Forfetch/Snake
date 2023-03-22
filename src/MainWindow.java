import javax.swing.*;
import java.awt.*;

public class MainWindow  extends JFrame {
    public MainWindow() throws HeadlessException {
        setTitle("Snake eye");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(340, 365);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);

    }
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}