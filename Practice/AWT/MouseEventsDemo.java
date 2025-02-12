package Practice;

import  java.awt.event.*;
import   java.awt.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0; // coordinates of mouse

    public  MouseEventsDemo(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindow());
    }


    // Handle mouse clicked.
    public void mouseClicked(MouseEvent me) {
// save coordinates
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked";
        repaint();
    }
    // Handle mouse entered.
    public void mouseEntered(MouseEvent me) {
// save coordinates
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered.";
        repaint();
    }
    // Handle mouse exited.
    public void mouseExited(MouseEvent me) {
// save coordinates
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited.";
        repaint();
    }

    // Handle button pressed.
    public void mousePressed(MouseEvent me) {
// save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Down";
        repaint();
    }

    // Handle button released.
    public void mouseReleased(MouseEvent me) {
// save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Up";
        repaint();
    }

    // Handle mouse dragged.
    public void mouseDragged(MouseEvent me) {
// save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + "mouse at " + mouseX + " , "+mouseY;
//showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }

    // Handle mouse moved.
    public void mouseMoved(MouseEvent me) {
        msg="Moving Mouse  at" + me.getX()+" ,"+me.getY();
        repaint();
    }
    // Display msg in  window at current X,Y location.
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }

    public static void main(String[] args){
        MouseEventsDemo appwin=new MouseEventsDemo();

        appwin.setSize(new Dimension(300,300));
        appwin.setTitle("MouseEventsDemo");
        appwin.setVisible(true);
    }
}

//When the close box  in the frame is clicked
//close the window and exit the program
class MyWindow  extends WindowAdapter{
    public void windowClosing(WindowEvent  we)  {
        System.exit(0);
    }
}
