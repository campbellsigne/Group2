package Boulder;
import javax.swing.*;

import java.awt.image.BufferedImage;

public class window extends JFrame{


    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Animation gp2");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        BufferedImage img = player.getAnimation().getSprite();
        JLabel picLabel = new JLabel(new ImageIcon(img));
        panel.add(picLabel);
        frame.getContentPane().add(panel);
        frame.pack();
        int i = 0;
        while(i <= 100){
            player.getAnimation().update();
            BufferedImage img2 = player.getAnimation().getSprite();
            picLabel.setIcon(new ImageIcon(img2));
            Thread.sleep(100);
            i++;
        }
    }
}
