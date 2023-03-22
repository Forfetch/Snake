import javax.swing.*;
import java.awt.*;

public class MainWindow  extends JFrame {
    public MainWindow() throws HeadlessException {
        setTitle("Snake eye");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}