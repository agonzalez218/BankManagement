//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener {
    public List<String> usernames = new ArrayList<String>(), passwords=new ArrayList<String>(), fullNames=new ArrayList<String>();
    public List<String> balances=new ArrayList<String>(), accountNumbers=new ArrayList<String>(),type=new ArrayList<String>();
    public int userIndex = 0;
    JPanel form = new JPanel();
    private JLabel userName = new JLabel("USERNAME");
    private JLabel password = new JLabel("PASSWORD");
    JTextField userText = new JTextField();
    JPasswordField passwordText = new JPasswordField();
    JButton login = new JButton("Login");
    JButton createAccount = new JButton("Create Account");

    public LoginForm() {
        this.form.setLayout((LayoutManager)null);
        this.setTitle("Internet Bank");
        this.setDefaultCloseOperation(3);
        this.setLocation();
        this.addComponents();
        this.add(this.form);
        this.setVisible(true);
    }

    private void setLocation() {
        this.setSize(370, 330);
        this.userName.setBounds(20, 10, 100, 30);
        this.userText.setBounds(100, 10, 150, 30);
        this.password.setBounds(20, 50, 100, 30);
        this.passwordText.setBounds(100, 50, 150, 30);
        this.login.setBounds(20, 150, 100, 30);
        this.createAccount.setBounds(150, 150, 150, 30);
    }

    private void addComponents() {
        this.form.add(this.userName);
        this.form.add(this.userText);
        this.form.add(this.password);
        this.form.add(this.passwordText);
        this.form.add(this.login);
        this.form.add(this.createAccount);
        this.login.addActionListener(this);
        this.createAccount.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String line = null, str = e.getActionCommand(), tokens[] = null;
        try(
                BufferedReader br = new BufferedReader(new FileReader("BankManagement/src/accountDatabase.txt"))) {
            line = br.readLine();   // read first line of file
            line = br.readLine();   // skip to second line to ensure only account information is within lists

            while (line != null) {
                tokens = line.split(",");
                usernames.add(tokens[0]);
                passwords.add(tokens[1]);
                fullNames.add(tokens[2]);
                type.add(tokens[3]);
                accountNumbers.add(tokens[4]);
                balances.add(tokens[5]);
                line = br.readLine();
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        if(str.equals("Login"))
        {
            userIndex = usernames.indexOf(userText.getText());
            if(userIndex == -1)
            {
                System.out.print("Invalid Username");
            }
            else if( passwords.get(userIndex).equals(passwordText.getText()))
            {
                this.setVisible(false);
                System.out.print(fullNames.get(userIndex) + accountNumbers.get(userIndex) + balances.get(userIndex));
                new MainForm(fullNames.get(userIndex), accountNumbers.get(userIndex), balances.get(userIndex));
            }
            else
            {
                System.out.print("Invalid Password");
            }
        }
    }
}
