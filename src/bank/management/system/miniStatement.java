package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class miniStatement extends JFrame implements ActionListener {

    String pin;

    JButton b1;

    miniStatement(String pin){
        this.pin = pin;

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,195);
        add(label1);


        JLabel label2 = new JLabel("Techcoder A.V");
        label2.setFont(new Font("System", Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        b1 = new JButton("EXIT");
        b1.setBounds(20,500,100,25);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        add(b1);



        try {
            connectivity con  = new connectivity();
            ResultSet rs = con.statement.executeQuery("select * from login where pin = '"+pin+"'");

            while(rs.next()){
               label3.setText("Card Number: "+rs.getString("card_no").substring(0,4)+"XXXXXXXX"+rs.getString("card_no").substring(12));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        try {
            connectivity con  = new connectivity();
            ResultSet resultSet = con.statement.executeQuery("select * from bank where pin = '" + pin + "'");
            int balance = 0;
            while (resultSet.next()) {
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

            label4.setText("Your Total Balance is Rs. "+balance);

        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
             setVisible(false);
    }

    public static void main(String[] args) {
        new miniStatement("");
    }
}
