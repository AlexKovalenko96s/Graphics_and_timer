package ua.kas.graphicsT;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GraphicsPanel_right extends JPanel {
	private static final long serialVersionUID = 8934618451076187236L;

	// private Line line1;
	// private Line line2;
	// private Rectangle rect;

	public GraphicsPanel_right() {
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
		g2.fillRect(0, 250, 640, 250);// ����
		g2.setColor(new Color(142, 226, 247));
		g2.fillRect(0, 0, 640, 250);// ����
		g2.setColor(Color.ORANGE);
		g2.fillOval(170, 230, 240, 80);// ������
		g2.setColor(Color.YELLOW);
		g2.fillOval(30, 60, 80, 80);// ��������
		g2.setColor(Color.WHITE);
		g2.fillOval(10, 95, 70, 70);// ������(�������)
		g2.fillOval(10, 120, 200, 50);// ������(�������)
		g2.setColor(Color.GRAY);
		g2.fillRoundRect(280, 140, 20, 120, 5, 5);// �����
		g2.setColor(Color.GREEN);
		g2.fillOval(280, 120, 80, 80);// ��������
		g2.fillOval(220, 120, 120, 80);// ��������
		g2.fillOval(240, 100, 80, 80);// ��������
		g2.setColor(Color.RED);
		g2.fillOval(250, 160, 15, 15);// �������
		g2.fillOval(280, 130, 15, 15);// �������
		g2.fillOval(320, 170, 15, 15);// �������

	}
}


