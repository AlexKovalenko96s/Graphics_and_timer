package ua.kas.graphicsT;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GraphicsPanel_up extends JPanel {
	private static final long serialVersionUID = -289991420940970277L;

	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		// g2.draw(line1);
		// g2.draw(line2);
		g2.setColor(Color.BLUE);
		g2.fillRect(0, 280, 640, 280);// вода
		g2.setColor(new Color(142, 226, 247));
		g2.fillRect(0, 0, 640, 280);// небо
		g2.setColor(Color.ORANGE);
		g2.fillOval(200, 260, 240, 80);// остров
		g2.setColor(Color.YELLOW);
		g2.fillOval(60, 90, 80, 80);// солнышко
		g2.setColor(Color.WHITE);
		g2.fillOval(40, 125, 70, 70);// облако(круглое)
		g2.fillOval(40, 150, 200, 50);// облако(длинное)
		g2.setColor(Color.GRAY);
		g2.fillRoundRect(310, 170, 20, 120, 5, 5);// ствол
		g2.setColor(Color.GREEN);
		g2.fillOval(310, 150, 80, 80);// листочки
		g2.fillOval(250, 150, 120, 80);// листочки
		g2.fillOval(270, 130, 80, 80);// листочки
		g2.setColor(Color.RED);
		g2.fillOval(280, 190, 15, 15);// яблочко
		g2.fillOval(310, 160, 15, 15);// яблочко
		g2.fillOval(350, 200, 15, 15);// яблочко
	}
}
