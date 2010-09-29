import java.awt.Container;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FillPolyPanel extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int radius = 40;
    int centerX = 50;
    int centerY = 100;
    int angle = 30; 

    int dx = (int) (radius * Math.cos(angle * Math.PI / 180));
    int dy = (int) (radius * Math.sin(angle * Math.PI / 180));

    g.fillArc(centerX - radius, centerY - radius, 2 * radius, 2 * radius, angle, 360 - 2 * angle);

    Polygon p = new Polygon();
    centerX = 150;
    for (int i = 0; i < 5; i++)
      p.addPoint((int) (centerX + radius * Math.cos(i * 2 * Math.PI / 5)),
          (int) (centerY + radius * Math.sin(i * 2 * Math.PI / 5)));

    g.fillPolygon(p);

    p = new Polygon();
    centerX = 250;
    for (int i = 0; i < 360; i++) {
      double t = i / 360.0;
      p.addPoint((int) (centerX + radius * t * Math.cos(8 * t * Math.PI)),
          (int) (centerY + radius * t * Math.sin(8 * t * Math.PI)));
    }
    g.fillPolygon(p);
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("FillPoly");
    frame.setSize(300, 200);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    Container contentPane = frame.getContentPane();
    contentPane.add(new FillPolyPanel());

    frame.show();
  }

}
