package Practice;

import javax.swing.*; // Correct import for Swing components
import java.awt.event.*; // Import for event handling

public class MyEvent extends JFrame {
    JButton b1; // Button declaration

    // Main Method
    public static void main(String[] args) {
        MyEvent event = new MyEvent();
    }

    // Constructor for the event derived class
    public MyEvent() {
        super("Window Title: Event Handling"); // Call the superclass constructor with the title
        b1 = new JButton("Click Me"); // Corrected JButton spelling

        // Place the button object on the window
        getContentPane().add(b1, "Center"); // Corrected parameter order

        // Register the listener for the button
        ButtonListener listen = new ButtonListener();
        b1.addActionListener(listen);

        // Display the window with a specific size
        setVisible(true);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the program exits when the window is closed
    }

    // The Listener Class
    class ButtonListener implements ActionListener {
        // Definition for actionPerformed() method
        public void actionPerformed(ActionEvent evt) {
            JButton source = (JButton) evt.getSource(); // Corrected case of getSource()
            source.setText("Button Has Been Clicked, Guru!"); // Corrected case of setText()
        }
    }
}

