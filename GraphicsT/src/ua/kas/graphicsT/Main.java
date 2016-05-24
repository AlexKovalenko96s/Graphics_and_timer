package ua.kas.graphicsT;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Main {

	static JFrame f = new JFrame();
	static Timer t = new Timer();
	static GraphicsPanel graphicsPanel = new GraphicsPanel();
	static GraphicsPanel_left graphicsPanel_left = new GraphicsPanel_left();
	static GraphicsPanel_right graphicsPanel_right = new GraphicsPanel_right();
	static GraphicsPanel_up graphicsPanel_up = new GraphicsPanel_up();
	static GraphicsPanel_down graphicsPanel_down = new GraphicsPanel_down();

	public static void main(String[] args) {

		f.setTitle("Try!");
		f.setSize(640, 480);
		f.setLocationRelativeTo(null);
		f.setLayout(new GridBagLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		f.add(graphicsPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2), 0, 0));
		f.add(graphicsPanel_down, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
		f.add(graphicsPanel_up, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
		f.add(graphicsPanel_left, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
		f.add(graphicsPanel_right, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
		graphicsPanel_down.setVisible(false);
		graphicsPanel_up.setVisible(false);
		graphicsPanel_left.setVisible(false);
		graphicsPanel_right.setVisible(false);

		f.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (graphicsPanel.isVisible() != true) {
					t.schedule(new TimerTask() {

						@Override
						public void run() {
							graphicsPanel_down.setVisible(false);
							graphicsPanel_up.setVisible(false);
							graphicsPanel_left.setVisible(false);
							graphicsPanel_right.setVisible(false);
							graphicsPanel.setVisible(true);
							t.schedule(new TimerTask() {

								@Override
								public void run() {
									graphicsPanel.setVisible(false);
									if (e.getKeyCode() == KeyEvent.VK_DOWN) {
										graphicsPanel_down.setVisible(true);
									}
									if (e.getKeyCode() == KeyEvent.VK_UP) {
										graphicsPanel_up.setVisible(true);
									}
									if (e.getKeyCode() == KeyEvent.VK_LEFT) {
										graphicsPanel_left.setVisible(true);
									}
									if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
										graphicsPanel_right.setVisible(true);
									}
									wait_kachka();
								}
							}, 1000);
						}
					}, 1000);

				}
				if (graphicsPanel.isVisible() == true) {
					t.schedule(new TimerTask() {

						@Override
						public void run() {
							graphicsPanel.setVisible(false);

							if (e.getKeyCode() == KeyEvent.VK_DOWN) {
								graphicsPanel_down.setVisible(true);
							}
							if (e.getKeyCode() == KeyEvent.VK_UP) {
								graphicsPanel_up.setVisible(true);
							}
							if (e.getKeyCode() == KeyEvent.VK_LEFT) {
								graphicsPanel_left.setVisible(true);
							}
							if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
								graphicsPanel_right.setVisible(true);
							}
							wait_kachka();
						}
					}, 1000);
				}
				f.setVisible(true);
			}
		});
		f.setVisible(true);
	}
	
	public static void wait_kachka(){
		t.schedule(new TimerTask() { 

			@Override
			public void run() {
				graphicsPanel_down.setVisible(false);
				graphicsPanel_up.setVisible(false);
				graphicsPanel_left.setVisible(false);
				graphicsPanel_right.setVisible(false);
				graphicsPanel.setVisible(true);

				t.schedule(new TimerTask() {

					@Override
					public void run() {
						graphicsPanel.setVisible(false);
						graphicsPanel_up.setVisible(true);

						t.schedule(new TimerTask() {

							@Override
							public void run() {
								graphicsPanel.setVisible(true);
								graphicsPanel_up.setVisible(false);

								t.schedule(new TimerTask() {

									@Override
									public void run() {
										graphicsPanel.setVisible(false);
										graphicsPanel_down.setVisible(true);

										t.schedule(new TimerTask() {

											@Override
											public void run() {
												graphicsPanel.setVisible(true);
												graphicsPanel_down.setVisible(false);
											}
										}, 800);
									}
								}, 800);
							}
						}, 800);
					}
				}, 800);
			}
		}, 5000);
	}
}