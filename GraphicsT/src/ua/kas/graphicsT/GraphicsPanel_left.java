package ua.kas.graphicsT;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GraphicsPanel_left extends JPanel {
	private static final long serialVersionUID = 8934618451076187236L;

	// private Line line1;
	// private Line line2;
	// private Rectangle rect;

	public GraphicsPanel_left() {
		// line1 = new Line(150, 10, 150, 200);
		// line2 = new Line(85, 95, 275, 95);

		// rect = new Rectangle(170, 200, 75, 100);
	}

	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		// g2.draw(line1);
		// g2.draw(line2);
		g2.setColor(Color.BLUE);
		g2.fillRect(0, 250, 640, 250);// вода
		g2.setColor(new Color(142, 226, 247));
		g2.fillRect(0, 0, 640, 250);// небо
		g2.setColor(Color.ORANGE);
		g2.fillOval(230, 230, 240, 80);// остров
		g2.setColor(Color.YELLOW);
		g2.fillOval(90, 60, 80, 80);// солнышко
		g2.setColor(Color.WHITE);
		g2.fillOval(70, 95, 70, 70);// облако(круглое)
		g2.fillOval(70, 120, 200, 50);// облако(длинное)
		g2.setColor(Color.GRAY);
		g2.fillRoundRect(340, 140, 20, 120, 5, 5);// ствол
		g2.setColor(Color.GREEN);
		g2.fillOval(340, 120, 80, 80);// листочки
		g2.fillOval(280, 120, 120, 80);// листочки
		g2.fillOval(300, 100, 80, 80);// листочки
		g2.setColor(Color.RED);
		g2.fillOval(310, 160, 15, 15);// яблочко
		g2.fillOval(340, 130, 15, 15);// яблочко
		g2.fillOval(380, 170, 15, 15);// яблочко

	}
}


