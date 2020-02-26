import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class AutoTunePanel extends JPanel {
private final int TILE_SIDE = 15;

private int selectedRow = -1;
private int selectedCol = -1;

public AutoTunePanel() {
	
	addMouseListener(new AutoTuneProxy() {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			int x = e.getX();
			int y = e.getY();
			
			selectedRow = y / TILE_SIDE; 
			selectedCol = x / TILE_SIDE;
			
			// paint(getGraphics());
			updateUI();
		}
	});
}

	
	public void paint(Graphics g) {
		
		for(int row = 0; row < 64; row++) {
			for(int col = 0; col < 64; col++) {
				render(g, row, col);
			}
		}
		
	}
	
	protected void render(Graphics g, int row, int col) {
		
		boolean isRowEven 	= (row % 2 == 0);
		boolean isColEvent 	= (col % 2 == 0);
		
		boolean isGood 	= (isRowEven && isColEvent) ||
							  (!isRowEven && !isColEvent);
		
		Color tileColor = isGood ? Color.GREEN 
								  : Color.BLUE;
		
		boolean isSelected = (row == selectedRow) && 
				 (col == selectedCol);
		
		
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		if(isSelected) {
			
			tileColor = Color.RED;
			g.setColor(tileColor);
			g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
			return;
		}
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	
	}
}
