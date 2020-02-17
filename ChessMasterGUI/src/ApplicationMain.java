import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.PaintEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ApplicationMain {

	public static void main(String[] args) {
		
		final int TILE_SIDE = 50;
		GameBoardPanel gm = new GameBoardPanel();

		JFrame windowFrame = new JFrame();
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(520, 540);
		windowFrame.add(new GameBoardPanel());
		windowFrame.add(gm);
		windowFrame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m) {
				
				Color tileRed = Color.RED;
				Graphics g=null;
				if (m.getClickCount() > 1) {
					System.out.println(m.getX() +", " + m.getY());
					g.setColor(tileRed);
					g.fillRect(m.getX(), m.getY(), TILE_SIDE, TILE_SIDE);
				}
			}
		});
//		windowFrame.add(new JPanel() {
//			
//			public void paint(Graphics g) {
//				
//				g.setColor(Color.GREEN);
//				g.fillRect(10, 10, 100, 100);
//			}
//		});
		
		new AbstractTest() {
			
			@Override
			public void initClassMethod() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		windowFrame.setVisible(true);

		String[] collection = new String[] {
			"H", "B", "C"	
		};
		
		
	}

	protected static void setColor(Color tileRed) {
		// TODO Auto-generated method stub
		
	}
}