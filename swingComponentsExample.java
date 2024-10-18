import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingComponentsExample {

    public static void main(String[] args) {
        // Creating a JFrame (the main window)
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JLabel - Displaying some text
        JLabel label = new JLabel("Select your preferences:");
        label.setBounds(50, 20, 200, 30);
        frame.add(label);

        // JButton - A button that can be clicked
        JButton button = new JButton("Click me");
        button.setBounds(50, 60, 150, 30);
        frame.add(button);

        // JCheckBox - A checkbox to select options
        JCheckBox checkBox = new JCheckBox("Option 1");
        checkBox.setBounds(50, 100, 150, 30);
        frame.add(checkBox);

        // JRadioButton - Only one can be selected in a group
        JRadioButton radioButton1 = new JRadioButton("Radio 1");
        radioButton1.setBounds(50, 140, 100, 30);
        frame.add(radioButton1);
        
        JRadioButton radioButton2 = new JRadioButton("Radio 2");
        radioButton2.setBounds(150, 140, 100, 30);
        frame.add(radioButton2);
        
        // Button group so only one radio button is selected at a time
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        // JList - A list of items to select from
        String[] listItems = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(listItems);
        list.setBounds(50, 180, 100, 60);
        frame.add(list);

        // JComboBox - A dropdown list
        String[] comboBoxItems = {"Choice 1", "Choice 2", "Choice 3"};
        JComboBox<String> comboBox = new JComboBox<>(comboBoxItems);
        comboBox.setBounds(50, 250, 150, 30);
        frame.add(comboBox);

        // JTextField - A text field for entering text
        JTextField textField = new JTextField("Type here...");
        textField.setBounds(50, 290, 150, 30);
        frame.add(textField);

        // JPasswordField - A field to enter passwords
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 330, 150, 30);
        frame.add(passwordField);

        // JTextArea - A text area for multi-line text
        JTextArea textArea = new JTextArea("This is a text area.");
        textArea.setBounds(50, 370, 200, 60);
        frame.add(textArea);

        // JColorChooser - Opens a color picker dialog
        JButton colorButton = new JButton("Pick a color");
        colorButton.setBounds(50, 440, 150, 30);
        frame.add(colorButton);
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(frame, "Choose a color", Color.black);
                System.out.println("Selected Color: " + color);
            }
        });

        // JScrollBar - A scroll bar for scrolling content
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(660, 20, 20, 500);
        frame.add(scrollBar);

        // JOptionPane - Displays a message dialog
        JButton messageButton = new JButton("Show message");
        messageButton.setBounds(50, 480, 150, 30);
        frame.add(messageButton);
        messageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "This is a message!");
            }
        });

        // JFileChooser - Opens a file picker dialog
        JButton fileButton = new JButton("Pick a file");
        fileButton.setBounds(50, 520, 150, 30);
        frame.add(fileButton);
        fileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(frame);
            }
        });

        // JProgressBar - Displays progress of a task
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 560, 150, 30);
        frame.add(progressBar);
        progressBar.setValue(75);  // Set the current progress (75%)

        // JSlider - A slider to select a value from a range
        JSlider slider = new JSlider(0, 100, 50);
        slider.setBounds(50, 600, 150, 50);
        frame.add(slider);

        // JSpinner - A spinner to select numbers
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        spinner.setBounds(50, 660, 50, 30);
        frame.add(spinner);

        // Show the frame
        frame.setVisible(true);
    }
}
