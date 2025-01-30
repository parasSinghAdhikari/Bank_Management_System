package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7,b8;

    String pin;
    main_class(String pin){
       this.pin =pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2 (1).png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Please select Your Transaction");
        label1.setBounds(430,180,700,35);
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,28));
        l3.add(label1);

        b1 =new JButton("DEPOSIT");
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        b1.setFont(new Font("System",Font.BOLD,12));
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        l3.add(b1);

        b2 =new JButton("CASH WITHDRAW");
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        b2.setFont(new Font("System",Font.BOLD,12));
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        l3.add(b2);

        b3 =new JButton("FAST CASH");
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        b3.setFont(new Font("System",Font.BOLD,12));
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        l3.add(b3);

        b4 =new JButton("MINI STATEMENT");
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
        b4.setFont(new Font("System",Font.BOLD,12));
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        l3.add(b4);

        b5 =new JButton("PIN CHANGE");
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        b5.setFont(new Font("System",Font.BOLD,12));
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        l3.add(b5);

        b6 =new JButton("BALANCE ENQUIRY");
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        b6.setFont(new Font("System",Font.BOLD,12));
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        l3.add(b6);

        b7 =new JButton("EXIT");
        b7.setBounds(700,406,150,35);
        b7.setFont(new Font("System",Font.BOLD,12));
        b7.addActionListener(this);
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        l3.add(b7);




        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b7) {
            System.exit(0);
        } else if (e.getSource()==b2) {
            new withdraw(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new balanceEnquiry(pin);
        } else if (e.getSource()==b3) {
            new fastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new miniStatement(pin);
        }
    }

    public static void main(String[] args) {
        new main_class("");
    }
}
