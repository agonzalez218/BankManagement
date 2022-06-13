//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainForm extends JFrame implements ActionListener {
    JPanel form = new JPanel();
    JLabel name = new JLabel();
    JLabel showName = new JLabel();
    JLabel accNum = new JLabel();
    JLabel showAccNum = new JLabel();
    JLabel balance = new JLabel();
    JLabel showBalance = new JLabel();
    JButton deposit = new JButton();
    JButton withdraw = new JButton();
    JButton logout = new JButton();
    JButton tEA = new JButton();
    JButton tIA = new JButton();
    JButton tOA = new JButton();
    String userName = "";
    String userBalance = "";
    String userAccountNum = "";

    public MainForm() {
        this.form.setLayout((LayoutManager)null);
        this.setLocation();
        this.setText();
        this.addComponents();
        this.setDefaultCloseOperation(3);
        this.add(this.form);
        this.setVisible(true);
    }

    public MainForm(String name, String accountNum, String balance) {
        this.form.setLayout((LayoutManager)null);
        this.userName = name;
        this.userBalance = balance;
        this.userAccountNum = accountNum;
        this.setLocation();
        this.setText();
        this.addComponents();
        this.setDefaultCloseOperation(3);
        this.add(this.form);
        this.setVisible(true);
    }

    private void setLocation() {
        this.setSize(400, 500);
        this.name.setBounds(10, 20, 100, 30);
        this.showName.setBounds(50, 20, 100, 30);
        this.accNum.setBounds(10, 60, 100, 30);
        this.showAccNum.setBounds(120, 60, 100, 30);
        this.balance.setBounds(10, 90, 100, 30);
        this.showBalance.setBounds(120, 90, 100, 30);
        this.tEA.setBounds(50, 160, 200, 40);
        this.tIA.setBounds(50, 200, 200, 40);
        this.tOA.setBounds(50, 260, 200, 40);
        this.deposit.setBounds(50, 300, 200, 40);
        this.withdraw.setBounds(50, 360, 200, 40);
        this.logout.setBounds(50, 400, 200, 40);
    }

    public void setText() {
        this.setTitle("Main Menu");
        this.name.setText("Name");
        this.balance.setText("Current Balance");
        this.accNum.setText("Account Number");
        this.showName.setText(userName);
        this.showBalance.setText(userBalance);
        this.showAccNum.setText(userAccountNum);
        this.tEA.setText("Transfer External Account");
        this.tIA.setText("Transfer Internal Account");
        this.tOA.setText("Transfer between your Accounts");
        this.deposit.setText("Deposit");
        this.withdraw.setText("Withdraw");
        this.logout.setText("Logout");
    }

    private void addComponents() {
        this.form.add(this.name);
        this.form.add(this.showName);
        this.form.add(this.balance);
        this.form.add(this.showBalance);
        this.form.add(this.accNum);
        this.form.add(this.showAccNum);
        this.form.add(this.tEA);
        this.form.add(this.tIA);
        this.form.add(this.tOA);
        this.form.add(this.withdraw);
        this.form.add(this.deposit);
        this.form.add(this.logout);
        deposit.addActionListener(this);
        tEA.addActionListener(this);
        tIA.addActionListener(this);
        tOA.addActionListener(this);
        withdraw.addActionListener(this);
        logout.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if( str.equals("Deposit"))
        {
            Deposit d = new Deposit();
            this.setVisible(false);
            d.setVisible(true);
        }
        else if(str.equals("Logout"))
        {
            System.exit(0);                         // exit program
        }
        else if(str.equals("Transfer External Account"))
        {
            TransferExternal te = new TransferExternal();
            this.setVisible(false);
            te.setVisible(true);
        }
        else if(str.equals("Transfer Internal Account"))
        {
            TransferInternal ti = new TransferInternal();
            this.setVisible(false);
            ti.setVisible(true);
        }
        else if(str.equals("Transfer between your Accounts"))
        {
            TransferOwnedAccounts toa = new TransferOwnedAccounts();
            this.setVisible(false);
            toa.setVisible(true);
        }
        else if(str.equals("Withdraw"))
        {
            Withdraw w = new Withdraw();
            this.setVisible(false);
            w.setVisible(true);
        }
    }
}
