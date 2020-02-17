import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameBoardPanel extends JPanel {
	
	private final int TILE_SIDE = 50;
	
	public void paint(Graphics g) {
		
		for(int row = 0; row < 10; row++) {
			for(int col = 0; col < 10; col++) {
				render(g, row, col);
			}
		}
		
		//g.setColor(Color.GREEN);
		//g.fillRect(10, 10, 100, 100);
	}
	
	protected void render(Graphics g, int row, int col) {
		
		boolean isRowEven 	= (row % 2 == 0);
		boolean isColEvent 	= (col % 2 == 0);
		
		boolean isWhite 	= (isRowEven && isColEvent) ||
							  (!isRowEven && !isColEvent);
		
		Color tileColor = isWhite ? Color.WHITE 
								  : Color.BLACK;
		
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	
	class MouseClicks implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent m) {
			
			System.out.println(m.getX() +", " + m.getY());
			Color tileRed = Color.RED;
			if (m.getClickCount() > 1) {
				g.setColor(tileRed);
				g.fillRect(m.getX(), m.getY(), TILE_SIDE, TILE_SIDE);
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
}