import javax.swing.*;

public class swingWithCheckbox {

public static void main(String[]args){
    JFrame f = new JFrame();
    JLabel l1 = new JLabel("Select known languages");
    


    l1.setBounds(100,50,190,80);
    f.add(l1);

    JCheckBox c2 = new JCheckBox("Filipino");
    c2.setBounds(100,150,100,50);
    f.add(c2);

    JRadioButton c3 = new JRadioButton("English");
    c3.setBounds(100, 200, 100,50);
    f.add(c3);

    JCheckBox c4 = new JCheckBox("Japanese");
    c4.setBounds(100, 250, 100,50);
    f.add(c4);

    JSpinner cb = new JSpinner();
    cb.setBounds(100, 350,80,80);
    f.add(cb);

    f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,500);
}}