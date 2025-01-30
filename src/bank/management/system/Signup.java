package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup extends JFrame implements ActionListener {

    Random ran = new Random();

    long first4 = (ran.nextLong()%9000L)+1000L;

    String first = " "+ Math.abs(first4);

    JTextField text_name ,textFname,textemail,textms,textadd,textcity,textpin,textstate;

    JDateChooser dateChooser;

    JRadioButton r1,r2,m1,m2,m3;

    JButton next;

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3  =new JLabel("Personal Details");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);

        JLabel labelname = new JLabel("Name :");
        labelname.setFont(new Font("Raleway",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        text_name =new JTextField();
        text_name.setFont(new Font("Raleway",Font.BOLD,14));
        text_name.setBounds(300,190,400,30);
        add(text_name);

        JLabel labelfname = new JLabel("Father's Name :");
        labelfname.setFont(new Font("Raleway",Font.BOLD,20));
        labelfname.setBounds(100,240,200,30);
        add(labelfname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel Dob = new JLabel("Date of Birth :");
        Dob.setFont(new Font("Raleway",Font.BOLD,20));
        Dob.setBounds(100,340,200,30);
        add(Dob);

        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("RaleWay",Font.BOLD,14));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("RaleWay",Font.BOLD,14));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);

        JLabel labelEmail =new JLabel("Email address :");
        labelEmail.setFont((new Font("Raleway",Font.BOLD,20)));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textemail = new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,14));
        textemail.setBounds(300,390,400,30);
        add(textemail);

        JLabel labelms =new JLabel("Martial status :");
        labelms.setFont((new Font("Raleway",Font.BOLD,20)));
        labelms.setBounds(100,440,200,30);
        add(labelms);

        m1 = new JRadioButton("Married");
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("RaleWay",Font.BOLD,14));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2= new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("RaleWay",Font.BOLD,14));
        m2.setBounds(450,440,100,30);
        add(m2);

        m3= new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("RaleWay",Font.BOLD,14));
        m3.setBounds(635,440,100,30);
        add(m3);

        ButtonGroup buttongroup1 = new ButtonGroup();
        buttongroup.add(m1);
        buttongroup.add(m2);
        buttongroup.add(m3);

        JLabel labeladd =new JLabel("Address :");
        labeladd.setFont((new Font("Raleway",Font.BOLD,20)));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelcity =new JLabel("City :");
        labelcity.setFont((new Font("Raleway",Font.BOLD,20)));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin =new JLabel("Pincode :");
        labelpin.setFont((new Font("Raleway",Font.BOLD,20)));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelstate =new JLabel("State :");
        labelstate.setFont((new Font("Raleway",Font.BOLD,20)));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(450,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno =first;
        String name = text_name.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;

        if(r1.isSelected()){
           gender = "Male";
       }else if(r2.isSelected()){
           gender = "Female";
       }

        String email  =textemail.getText();

        String martial = null;

        if (m1.isSelected()){
           martial = "Married";
       } else if (m2.isSelected()) {
           martial = "Unmarried";
       }else {
           martial = "other";
       }

        String address = textadd.getText();
        String pincode = textpin.getText();
        String city  = textcity.getText();
        String state = textstate.getText();

        try {
            if(text_name.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                connectivity con = new connectivity();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+ gender+"'" +
                        "," + "'"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";

              con.statement.executeUpdate(q);
              new signup2(first);
              setVisible(false);
            }
        }catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
     new Signup();
    }
}
