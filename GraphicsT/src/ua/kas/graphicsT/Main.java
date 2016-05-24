package ua.kas.graphicsT;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Main{

	static JFrame f = new JFrame();
	static Timer t = new Timer();
	static GraphicsPanel graphicsPanel = new GraphicsPanel();
	static GraphicsPanel_left graphicsPanel_left = new GraphicsPanel_left();
	static GraphicsPanel_right graphicsPanel_right = new GraphicsPanel_right();
	static GraphicsPanel_up graphicsPanel_up = new GraphicsPanel_up();
	static GraphicsPanel_down graphicsPanel_down = new GraphicsPanel_down();
	static Boolean up = false;
	static Boolean down = false;
	static int x1=500;
	static int y1=50;
	static int x11=510;
	static int y11=60;
	
	static int x2=510;
	static int y2=60;
	static int x22=520;
	static int y22=50;
	
	static int i = 1;
	
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
										down = true;
										up = false;
										graphicsPanel_down.x1=x1-20*i;
										graphicsPanel_down.x11=x11-20*i;
										graphicsPanel_down.x2=x2-20*i;
										graphicsPanel_down.x22=x22-20*i;
									}
									if (e.getKeyCode() == KeyEvent.VK_UP) {
										graphicsPanel_up.setVisible(true);
										up = true;
										down = false;
										graphicsPanel_up.setVisible(true);
										graphicsPanel_down.x1=x1-20*i;
										graphicsPanel_down.x11=x11-20*i;
										graphicsPanel_down.x2=x2-20*i;
										graphicsPanel_down.x22=x22-20*i;
									}
									if (e.getKeyCode() == KeyEvent.VK_LEFT) {
										graphicsPanel_left.setVisible(true);
										graphicsPanel_left.x1=x1-20*i;
										graphicsPanel_left.x11=x11-20*i;
										graphicsPanel_left.x2=x2-20*i;
										graphicsPanel_left.x22=x22-20*i;
									}
									if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
										graphicsPanel_right.setVisible(true);
										graphicsPanel_right.x1=x1-20*i;
										graphicsPanel_right.x11=x11-20*i;
										graphicsPanel_right.x2=x2-20*i;
										graphicsPanel_right.x22=x22-20*i;
									}
									i++;
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
								graphicsPanel_down.x1=x1-20*i;
								graphicsPanel_down.x11=x11-20*i;
								graphicsPanel_down.x2=x2-20*i;
								graphicsPanel_down.x22=x22-20*i;
								down = true;
								up = false;
							}
							if (e.getKeyCode() == KeyEvent.VK_UP) {
								graphicsPanel_up.setVisible(true);
								graphicsPanel_down.x1=x1-20*i;
								graphicsPanel_down.x11=x11-20*i;
								graphicsPanel_down.x2=x2-20*i;
								graphicsPanel_down.x22=x22-20*i;
								up = true;
								down = false;
								
							}
							if (e.getKeyCode() == KeyEvent.VK_LEFT) {
								graphicsPanel_left.setVisible(true);
								graphicsPanel_left.x1=x1-20*i;
								graphicsPanel_left.x11=x11-20*i;
								graphicsPanel_left.x2=x2-20*i;
								graphicsPanel_left.x22=x22-20*i;
							}
							if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
								graphicsPanel_right.setVisible(true);
								graphicsPanel_right.x1=x1-20*i;
								graphicsPanel_right.x11=x11-20*i;
								graphicsPanel_right.x2=x2-20*i;
								graphicsPanel_right.x22=x22-20*i;
							}
							
							i++;
							wait_kachka();
						}
					}, 1000);
				}
				f.setVisible(true);
			}
		});
		graphicsPanel.x1=x1;
		graphicsPanel.y1=y1;
		graphicsPanel.x11=x11;
		graphicsPanel.y11=y11;
		
		graphicsPanel.x2=x2;
		graphicsPanel.y2=y2;
		graphicsPanel.x22=x22;
		graphicsPanel.y22=y22;
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
				graphicsPanel.x1=x1-20*i;
				graphicsPanel.x11=x11-20*i;
				graphicsPanel.x2=x2-20*i;
				graphicsPanel.x22=x22-20*i;
				i++;
				t.schedule(new TimerTask() {

					@Override
					public void run() {
						if(up!=true && down == true){
							graphicsPanel.setVisible(false);
							graphicsPanel_up.setVisible(true);
							graphicsPanel_up.x1=x1-20*i;
							graphicsPanel_up.x11=x11-20*i;
							graphicsPanel_up.x2=x2-20*i;
							graphicsPanel_up.x22=x22-20*i;
						}
						if(up==true && down != true){
							graphicsPanel.setVisible(false);
							graphicsPanel_down.setVisible(true);
							graphicsPanel_down.x1=x1-20*i;
							graphicsPanel_down.x11=x11-20*i;
							graphicsPanel_down.x2=x2-20*i;
							graphicsPanel_down.x22=x22-20*i;
						}
						
						i++;
						t.schedule(new TimerTask() {

							@Override
							public void run() {
								graphicsPanel.setVisible(true);
								graphicsPanel_up.setVisible(false);
								graphicsPanel_down.setVisible(false);
								graphicsPanel.x1=x1-20*i;
								graphicsPanel.x11=x11-20*i;
								graphicsPanel.x2=x2-20*i;
								graphicsPanel.x22=x22-20*i;
								i++;
								
								t.schedule(new TimerTask() {
									
									@Override
									public void run() {
										if(up==true && down != true){
											graphicsPanel.setVisible(false);
											graphicsPanel_up.setVisible(true);
											graphicsPanel_up.x1=x1-20*i;
											graphicsPanel_up.x11=x11-20*i;
											graphicsPanel_up.x2=x2-20*i;
											graphicsPanel_up.x22=x22-20*i;
										}
										if(up!=true && down == true){
											graphicsPanel.setVisible(false);
											graphicsPanel_down.setVisible(true);
											graphicsPanel_down.x1=x1-20*i;
											graphicsPanel_down.x11=x11-20*i;
											graphicsPanel_down.x2=x2-20*i;
											graphicsPanel_down.x22=x22-20*i;
										}
										i++;
										
										t.schedule(new TimerTask() {

											@Override
											public void run() {
												graphicsPanel.setVisible(true);
												graphicsPanel_down.setVisible(false);
												graphicsPanel_up.setVisible(false);
												graphicsPanel.x1=x1-20*i;
												graphicsPanel.x11=x11-20*i;
												graphicsPanel.x2=x2-20*i;
												graphicsPanel.x22=x22-20*i;
												i++;
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