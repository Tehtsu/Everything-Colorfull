/**
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


import javax.swing.*;
import java.awt.*;

public class Shapes extends JFrame {

    private String title = "Alles Bunt";
    private BorderLayout layout = new BorderLayout();
    private String bLayout = layout.CENTER;
    private int setFrameWidth = 1000;
    private int setFrameHeight = 400;
    private boolean setFrameVisibility = true;
    private ImageIcon icon = new ImageIcon("icon/geometric-shape.png");



    public Shapes(){
        setTitle(title); // window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // action if closed the window
        setLayout(layout); // Layout-Manager
        setSize(setFrameWidth, setFrameHeight); // window size
        setVisible(setFrameVisibility); // window visibility

        // set Window icon
        setIconImage(icon.getImage());

        JPanel panel = new Panel();
        add(panel, bLayout);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Shapes::new);
    }

    private static class Panel extends JPanel {

        @Override protected void paintComponent(Graphics gfx){
            super.paintComponent(gfx);
            Graphics2D gfx2d = (Graphics2D) gfx; // needed for thicker drawLine()

            //circle
            gfx.setColor(Color.RED);
            gfx.fillOval(100,100,200,200);

            // rectangle
            gfx.setColor(Color.BLUE);
            gfx.fillRect(400,100,300,200);

            // line
            gfx.setColor(Color.GREEN);
            gfx2d.setStroke(new BasicStroke(2)); // defines the thickness of drawLine()
            gfx2d.drawLine(800,200,900,300);
        }
    }
}
