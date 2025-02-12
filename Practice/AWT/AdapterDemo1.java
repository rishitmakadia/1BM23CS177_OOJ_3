package Practice;

// Demonstrate an adapter.
import java.awt.*;
import java.awt.event.*;

public class AdapterDemo1 extends Frame {
    String msg="";

    public AdapterDemo1() {

        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,20,80);
    }

    public static void main(String args[]){
        AdapterDemo1 appwin =new AdapterDemo1();
        appwin.setSize(new Dimension(300,180));
        appwin.setTitle("AdapterDemo");
        appwin.setVisible(true);
    }
}


class MyMouseAdapter extends MouseAdapter {
    AdapterDemo1 adapterDemo;
    public MyMouseAdapter(AdapterDemo1 adapterDemo) {
        this.adapterDemo = adapterDemo;
    }
    // Handle mouse clicked.
    public void mouseClicked(MouseEvent me) {
        adapterDemo.msg="MouseClicked";
        adapterDemo.repaint();
    }

    public void mouseDragged(MouseEvent me) {
        adapterDemo.msg="Mouse dragged";
        adapterDemo.repaint();
    }
}

//When the close box in the frane is clicked close the window and exit
class MyWindowAdapter extends WindowAdapter {

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

}
