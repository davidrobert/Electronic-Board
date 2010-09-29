import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import sl.shapes.RegularPolygon;
import sl.shapes.RoundPolygon;

public class Hexagono extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		RegularPolygon r = new RegularPolygon(200, 200, 100, 6, 180);
		RoundPolygon p = new RoundPolygon(r, 10);
		
		g2.fill(p);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("Hexagono");

		frame.setSize(600, 400);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Container contentPane = frame.getContentPane();

		contentPane.add(new Hexagono());

		frame.setVisible(true);
	}
}
