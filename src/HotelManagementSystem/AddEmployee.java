package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameText, ageText, salaryText, phoneText, aadharText, emailText;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox comboBox;
    JButton add,back;
    AddEmployee(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JLabel name = new JLabel("Name");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(new Color(79, 79, 79));
        nameText.setFont(new Font("Tahoma", Font.BOLD,14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel Age = new JLabel("Age");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("serif", Font.BOLD, 17));
        Age.setForeground(Color.WHITE);
        panel.add(Age);
        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(new Color(79, 79, 79));
        ageText.setFont(new Font("Tahoma", Font.BOLD,14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif", Font.BOLD, 17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("Male");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(new Color(3,45,48));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("Female");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(new Color(44, 44, 44));
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel job = new JLabel("Designation");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("serif", Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Front Desk", "Housekeeping", "Kitchen Staff","Room Service", "Manager", "Accountant","Chef"});
        comboBox.setBackground(new Color(79, 79, 79));
        comboBox.setBounds(200,170,150,30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif", Font.BOLD, 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(new Color(79, 79, 79));
        salaryText.setFont(new Font("Tahoma", Font.BOLD,14));
        salaryText.setForeground(Color.WHITE);
        panel.add(salaryText);

        JLabel phone = new JLabel("Ph. No.");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif", Font.BOLD, 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(new Color(79, 79, 79));
        phoneText.setFont(new Font("Tahoma", Font.BOLD,14));
        phoneText.setForeground(Color.WHITE);
        panel.add(phoneText);

        JLabel aadhar = new JLabel("Aadhar No.");
        aadhar.setBounds(60,320,150,27);
        aadhar.setFont(new Font("serif", Font.BOLD, 17));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);
        aadharText = new JTextField();
        aadharText.setBounds(200,320,150,27);
        aadharText.setBackground(new Color(79, 79, 79));
        aadharText.setFont(new Font("Tahoma", Font.BOLD,14));
        aadharText.setForeground(Color.WHITE);
        panel.add(aadharText);

        JLabel email = new JLabel("Email");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif", Font.BOLD, 17));
        email.setForeground(Color.WHITE);
        panel.add(email);
        emailText = new JTextField();
        emailText.setBounds(200,370,150,27);
        emailText.setBackground(new Color(79, 79, 79));
        emailText.setFont(new Font("Tahoma", Font.BOLD,14));
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);

        JLabel AED = new JLabel("Add Employee Details");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        add = new JButton("Add");
        add.setBounds(80,420,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(200,420,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);


        setUndecorated(true);
        setLocation(60,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String aadhar = aadharText.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if (radioButtonM.isSelected()){
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = " Female";
            }

            try{
                conn c = new conn();
                String q = "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"','"+phone+"', '"+email+"', '"+aadhar+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employee Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }


        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
