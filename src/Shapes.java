/**
 * (2) Alles bunt!
 * Programmiersprachen
 *      Java
 * Zielstellung
 *      – Einführung in JFC/Swing
 *      – Verwendung eines Layout-Managers
 * Aufgabenbeschreibung
 *      – es ist ein Fenster zu erstellen, dass verschiedene geometrische Formen
 *          auf einem Panel darstellt.
 *      – Es ist mindestens ein Kreis, ein Rechteck und eine Linie zu zeichnen.
 *      – Die geometrischen Formen [außer die Linie :-)] sollen jeweils farbig
 *          ausgefüllt sein.
 *      – Es ist ein geeigneter Layout-Manager zum Platzieren des Panels zu
 *          verwenden.
 * Hinweise zur Herangehensweise
 *      – siehe Swing Tutorial
 *      http://download.oracle.com/javase/tutorial/uiswing/index.html
 *      – zum Zeichnen der Figuren ist die paint-Methode eines Panels (JPanel) zu
 *      überschreiben. Siehe dazu
 *      http://openbook.galileocomputing.de/javainsel/
 *      Punkt 14.9.3 Zeichnen von Inhalten auf ein JFrame
 */


import javax.swing.*;
import java.awt.*;

public class Shapes extends JFrame {

    public Shapes(){
        setTitle("Alles Bunt"); // window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // action if closed the window
        setLayout(new BorderLayout()); // Layout-Manager
        setSize(1000, 400); // window size
        setVisible(true); // window visibility

        //Window icon
        ImageIcon icon = new ImageIcon("icon/geometric-shape.png");
        setIconImage(icon.getImage());

        JPanel panel = new Panel();
        String bLayout = BorderLayout.CENTER;
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
