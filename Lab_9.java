import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Division {
    public void createUI() {
        //frame
        JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        //UI components
        JLabel label1 = new JLabel("Num1:");
        JTextField text1 = new JTextField();
        JLabel label2 = new JLabel("Num2:");
        JTextField text2 = new JTextField();
        JLabel labelResult = new JLabel("Result:");
        JTextField textResult = new JTextField();
        textResult.setEditable(false); // Result field is not editable
        JButton buttonDivide = new JButton("Divide");

        // Add components to the frame
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(labelResult);
        frame.add(textResult);
        frame.add(new JLabel()); // Empty space
        frame.add(buttonDivide);

        // Add action listener to the button
        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int result = num1 / num2;
                    textResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Division by zero is not allowed!", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

class Lab_9 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Division().createUI());
    }
}



