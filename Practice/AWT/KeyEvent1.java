package Practice.AWT;

//package Practice;

import java.awt.*;
import java.awt.event.*;

public class KeyEvent1 extends Frame implements KeyListener {

    String msg = "";        // Stores the message for key events
    String sourceInfo = ""; // Stores information about the key source
    int X = 50, Y = 50;     // Output coordinates

    // Constructor to set up the frame and key listener
    public KeyEvent1() {
        super("Key Events Frame Example");

        setSize(400, 200);
        setVisible(true);

        // Add key listener to the frame
        addKeyListener(this);
        setFocusable(true); // Ensure the frame can gain focus

        // Window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int key = ke.getKeyCode();
        switch (key) {
            case KeyEvent.VK_F1:
                msg = "<F1>";
                break;
            case KeyEvent.VK_F2:
                msg = "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg = "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg = "<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg = "<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                msg = "<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                msg = "<Right Arrow>";
                break;
            default:
                msg = "Key Code: " + key;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        setTitle("Key Released");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        msg = "Typed: " + ke.getKeyChar();
        sourceInfo = "Source: " + ke.getSource().getClass().getName();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Message: " + msg, X, Y);
        g.drawString("Source: " + sourceInfo, X, Y + 20);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        new KeyEvent1(); // Launch the frame-based application
    }
}

