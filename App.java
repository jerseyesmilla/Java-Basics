import javax.swing.*;  
import java.awt.event.*;  

public class App {  
    public static void main(String[] args) {  
        // Create a new frame
        JFrame frame = new JFrame("Swing Demo");  
        
        // Create a button
        JButton button = new JButton("Click Me");  
        button.setBounds(100, 100, 150, 40);  // Set the button position and size
        
        // Create a label
        JLabel label = new JLabel("Hello, Swing!");  
        label.setBounds(100, 160, 150, 40);  // Set the label position and size
        
        // Add action listener to button
        button.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                label.setText("Button Clicked!");  // Change label text when button is clicked
            }  
        });  
        
        // Add the button and label to the frame
        frame.add(button);  
        frame.add(label);  
        
        // Frame properties
        frame.setSize(400, 400);  // Set frame size
        frame.setLayout(null);    // Use no layout manager
        frame.setVisible(true);   // Make frame visible
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the app when clicking close
    }  
}  
