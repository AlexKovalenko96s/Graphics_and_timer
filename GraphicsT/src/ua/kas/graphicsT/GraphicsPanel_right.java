package ua.kas.graphicsT;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;

import javax.swing.JPanel;

public class GraphicsPanel_right extends JPanel {
	private static final long serialVersionUID = 8934618451076187236L;
	private Polygon poly;
	// private Line line1;
	// private Line line2;
	// private Rectangle rect;
	int x1,x2,x11,x22,y1,y2,y11,y22;
	public GraphicsPanel_right() {
		// line1 = new Line(150, 10, 150, 200);
		// line2 = new Line(85, 95, 275, 95);

		// rect = new Rectangle(170, 200, 75, 100);
	}

	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		g2.rotate(0.1,600, 0);
		
		// g2.draw(line1);
		// g2.draw(line2);
		g2.setColor(Color.BLUE);
		g2.fillRect(-100, 250, 840, 350);// ����
		g2.setColor(new Color(142, 226, 247));
		g2.fillRect(-100, 0, 840, 250);// ����
		g2.setColor(Color.ORANGE);
		g2.fillOval(200, 230, 240, 80);// ������
		g2.setColor(Color.YELLOW);
		g2.fillOval(60, 60, 80, 80);// ��������
		g2.setColor(Color.WHITE);
		g2.fillOval(40, 95, 70, 70);// ������(�������)
		g2.fillOval(40, 120, 200, 50);// ������(�������)
		g2.setColor(Color.GRAY);
		g2.fillRoundRect(310, 140, 20, 120, 5, 5);// �����
		g2.setColor(Color.GREEN);
		g2.fillOval(310, 120, 80, 80);// ��������
		g2.fillOval(250, 120, 120, 80);// ��������
		g2.fillOval(270, 100, 80, 80);// ��������
		g2.setColor(Color.RED);
		g2.fillOval(280, 160, 15, 15);// �������
		g2.fillOval(310, 130, 15, 15);// �������
		g2.fillOval(350, 170, 15, 15);// �������
		g2.setColor(Color.BLACK);
		g2.drawLine(x1, y1, x11, y11);
		g2.drawLine(x2, y2, x22, y22);
	
	}
}


