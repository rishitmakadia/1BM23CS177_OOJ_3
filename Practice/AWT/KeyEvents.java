package Practice;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="KeyEvents" width=400 height=200>
// </applet>

public class KeyEvents extends Applet implements KeyListener {
    String msg = "";      // Stores the message for key events
    String sourceInfo = ""; // Stores information about the key source
    int X = 10, Y = 20;   // Output coordinates

    @Override
    public void init() {
        addKeyListener(this); // Add key listener to the applet
        setFocusable(true);   // Ensure the applet can gain focus
        requestFocusInWindow(); // Request focus to capture key events
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down");
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
        showStatus("Key Up");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        msg = "Typed: " + ke.getKeyChar();
        sourceInfo = "Source: " + ke.getSource().getClass().getName();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Message: " + msg, X, Y);
        g.drawString("Source: " + sourceInfo, X, Y + 20);
    }
}
