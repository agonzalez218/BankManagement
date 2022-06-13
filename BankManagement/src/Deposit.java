//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.sun.tools.javac.Main;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener {
    JPanel form = new JPanel();
    JLabel tAmount = new JLabel("Deposit Amount");
    JTextField tAmountTxt = new JTextField();
    JButton cTransfer = new JButton("Confirm Deposit");
    JButton cancel = new JButton("Cancel");

    public Deposit() {
        this.form.setLayout((LayoutManager)null);
        this.setTitle("Deposit");
        this.setLocation();
        this.addComponents();
        this.setDefaultCloseOperation(3);
        this.add(this.form);
        this.setVisible(true);
    }

    private void setLocation() {
        this.setSize(400, 250);
        this.tAmount.setBounds(10, 80, 150, 30);
        this.tAmountTxt.setBounds(150, 80, 150, 30);
        this.cTransfer.setBounds(10, 120, 150, 30);
        this.cancel.setBounds(150, 120, 100, 30);
    }

    private void addComponents() {
        this.form.add(this.tAmount);
        this.form.add(this.tAmountTxt);
        this.form.add(this.cancel);
        this.form.add(this.cTransfer);
        cTransfer.addActionListener(this);
        cancel.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if( str.equals("Confirm Deposit"))
        {
            Deposit d = new Deposit();
            this.setVisible(false);
            d.setVisible(true);
        }
        else if(str.equals("Cancel"))
        {
            MainForm mf = new MainForm();
            this.setVisible(false);
            mf.setVisible(true);

        }
    }
}
