import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameField extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;

    private Image dot, apple;

    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];

    private int appleX, appleY;

    private int dots;
    private Timer timer;

    private boolean inGame = true;

    public void loadImage(){
        ImageIcon iia = new ImageIcon("apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("dot.png");
        dot = iid.getImage();
    }

    public void createApple(){
        Random random = new Random();
        appleX = random.nextInt(20)*DOT_SIZE;
        appleY = random.nextInt(20)*DOT_SIZE;
    }
    public void initGame(){
        dots = 3;
        for (int i = 0; i < dots; i++) {
            y[i] = 48;
            x[i] = 48 - i*DOT_SIZE;
        }
        timer = new Timer(150, this);
        timer.start();
        createApple();
    }
    public void  checkApple(){
        if (x[0]==appleX && y[0]==appleY){
            dots++;
            createApple();
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (inGame){
            g.drawImage(apple, appleX, appleY, this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);
            }
        }else {
            String str = "GAME OVER";
            g.setColor(Color.CYAN);
            g.drawString(str, SIZE/6, SIZE/6);
        }
    }
}
