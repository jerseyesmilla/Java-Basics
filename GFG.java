import java.io.*;
import javax.swing.*;

class GFG{
    public static void main(String[]args){
        JFrame myFrame = new JFrame();
        JButton letter1 = new JButton("A");
        JButton letter2 = new JButton("B");
        JButton letter3 = new JButton("C");
        JButton letter4 = new JButton("D");
        JButton letter5 = new JButton("E");
        JButton letter6 = new JButton("F");
        JButton letter7 = new JButton("G");
        JButton letter8 = new JButton("H");
        JButton letter9 = new JButton("I");
        JButton letter10 = new JButton("J");
        JButton letter11 = new JButton("K");
        JButton letter12 = new JButton("L");

        letter1.setBounds(30, 30, 50,50);
        letter2.setBounds(85, 30, 50,50);
        letter3.setBounds(140, 30, 50,50);
        letter4.setBounds(30, 85, 50,50);
        letter5.setBounds(30, 140, 50,50);
        letter6.setBounds(30, 195, 50,50);

        myFrame.add(letter1);
        myFrame.add(letter2);
        myFrame.add(letter3);
        myFrame.add(letter4);
        myFrame.add(letter5);
        myFrame.add(letter6);

        myFrame.setSize(500,500);
        myFrame.setLayout(null);
        myFrame.setVisible(true);


    }
}