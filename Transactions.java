package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Transactions extends JFrame implements ActionListener{

    JLabel text;
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        text = new JLabel("Please Select Your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
       
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("CASH WITHDRAWL");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("MINI STATEMENT");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("PIN CHANGE");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        balanceenquiry.setBounds(355,485,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("EXIT");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
      
        
        deposit.addActionListener(this);
        withdrawl.addActionListener(this);
        fastcash.addActionListener(this);
        ministatement.addActionListener(this);
        pinchange.addActionListener(this);
        balanceenquiry.addActionListener(this);
        exit.addActionListener(this);
        
        
        setSize(960,1080);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
   public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == exit) { 
        System.exit(0);
        
    } else if (ae.getSource() == deposit) {
        setVisible(false);
        // Handle deposit functionality here
        new Deposit(pinnumber).setVisible(true);
        
    } else if (ae.getSource() == withdrawl) {
        setVisible(false);
        // Handle withdrawal functionality here
        new Withdrawl(pinnumber).setVisible(true);
        
    } else if (ae.getSource() == fastcash) {
        setVisible(false);
        // Handle fast cash functionality here
        new FastCash(pinnumber).setVisible(true);
        
    } else if (ae.getSource() == pinchange) {
        setVisible(false);
        // Handle pin change functionality here
       new PinChange(pinnumber).setVisible(true);
    
    } else if (ae.getSource() == balanceenquiry) {
        setVisible(false);
        // Handle balance enquiry functionality here
        new BalanceEnquiry(pinnumber).setVisible(true);
    } else if (ae.getSource() == ministatement) {
        // Handle mini statement functionality here
        new MiniStatement(pinnumber).setVisible(true);
    }
}
    
    public static void main(String[] args){
        new Transactions("");
    }
}