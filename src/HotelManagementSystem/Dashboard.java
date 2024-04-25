package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add,rec;
    Dashboard(){
        super("Hotel Management System");

        getContentPane().setBackground(new Color(44, 44, 44));

        rec = new JButton("Reception");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma", Font.BOLD,15));
        rec.setBackground(new Color(79, 79, 79));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("Admin");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma", Font.BOLD,15));
        add.setBackground(new Color(79, 79, 79));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/Boss.png"));
        Image i2 = i11.getImage().getScaledInstance(200,195, Image.SCALE_SMOOTH);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(850,300,200,195);
        add(label1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i22 = i111.getImage().getScaledInstance(200,195, Image.SCALE_SMOOTH);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(400,300,200,195);
        add(label11);


        setLayout(null);
        setSize(1920,1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rec){
            new Reception();
            setVisible(false);
        }else {
            new Login2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
