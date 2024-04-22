package HotelManagementSystem;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash.png"));

        Image image = imageIcon.getImage(); // Convert ImageIcon to Image
        Image newImg = image.getScaledInstance(429, 429, Image.SCALE_AREA_AVERAGING);
        // Scale it to half in both dimensions (if original is 858x680)
        imageIcon = new ImageIcon(newImg);


        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        add(label);

        setLayout(null);

        getContentPane().setBackground(Color.BLACK);


        setLocation(300,80);
        setSize(858,680);
        setVisible(true);

        try {
            Thread.sleep(1000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
