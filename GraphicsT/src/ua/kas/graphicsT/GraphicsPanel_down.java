package ua.kas.graphicsT;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GraphicsPanel_down extends JPanel {
	private static final long serialVersionUID = 8934618451076187236L;

	// private Line line1;
	// private Line line2;
	// private Rectangle rect;
	int x1,x2,x11,x22,y1,y2,y11,y22;
	public GraphicsPanel_down() {
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
		g2.fillRect(0, 220, 640, 250);// вода
		g2.setColor(new Color(142, 226, 247));
		g2.fillRect(0, 0, 640, 220);// небо
		g2.setColor(Color.ORANGE);
		g2.fillOval(200, 200, 240, 80);// остров
		g2.setColor(Color.YELLOW);
		g2.fillOval(60, 60, 80, 80);// солнышко
		g2.setColor(Color.WHITE);
		g2.fillOval(40, 95, 70, 70);// облако(круглое)
		g2.fillOval(40, 120, 200, 50);// облако(длинное)
		g2.setColor(Color.GRAY);
		g2.fillRoundRect(310, 110, 20, 120, 5, 5);// ствол
		g2.setColor(Color.GREEN);
		g2.fillOval(310, 90, 80, 80);// листочки
		g2.fillOval(250, 90, 120, 80);// листочки
		g2.fillOval(270, 70, 80, 80);// листочки
		g2.setColor(Color.RED);
		g2.fillOval(280, 130, 15, 15);// яблочко
		g2.fillOval(310, 100, 15, 15);// яблочко
		g2.fillOval(350, 140, 15, 15);// яблочко
		g2.setColor(Color.BLACK);
		g2.drawLine(x1, y1, x11, y11);
		g2.drawLine(x2, y2, x22, y22);
	}
}


