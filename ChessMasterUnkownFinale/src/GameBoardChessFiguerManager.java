import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import com.chessmaster.config.PieceColor;
import com.chessmaster.manager.GameBoard;


import static com.chessmaster.manager.GameBoard.board;
import static com.chessmaster.manager.GameBoard.MouseClick;

public class GameBoardChessFiguerManager extends JPanel{

	private final int TILE = 50;
    private boolean pieeceSelected = false;
    private int currentRow = -1;
    private int curretCol = -1;

    private String currentPlayerColor = PieceColor.WHITE;

    private int selectedRow = -1;
    private int selectedCol = -1;
  

    public GameBoardChessFiguerManager() {
    	
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("ChessMaster");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.setSize(600, 600);

                frame.add(new ChessPanel(null));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
            
            
        });
    }

    public class ChessPanel extends JPanel {

        public ChessPanel(Graphics g) {

            setLayout(new GridBagLayout());


            GridBagConstraints gbc = new GridBagConstraints();
            for (int row = 0; row < 10; row++) {
                for (int col = 0; col < 10; col++) {
                    gbc.gridx = col;
                    gbc.gridy = row;

                    CellPane cellPane = new CellPane();
                    Border border ;

                    boolean isRowEven = (row % 2 == 0);
                    boolean isColEven = (col % 2 == 0);

                    boolean isTileWhite = (isRowEven && isColEven) ||
                            (!isRowEven && !isColEven);

                    Color tileColor = (isTileWhite) ? Color.WHITE
                            : Color.BLACK;

                    cellPane.defaultBackground = tileColor;
                    cellPane.setBackground(tileColor);

                    BufferedImage myPicture = null;
                    if (board[row][col] != null) {
                        try {
                            myPicture = ImageIO.read(new File(board[row][col].getImage()));
                        } catch (IOException | NullPointerException ex) {
                            ex.printStackTrace();
                        }

                        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
                        cellPane.add(picLabel);
                    }
                    add(cellPane, gbc);
                    
                    boolean isSelected = (row == selectedRow) &&
                            (col == selectedCol);

                    if (isSelected) {

                        tileColor =  new Color(174, 215, 00, 100);
                        g.setColor(tileColor);

                        g.fillRect(getX(), getY(), TILE, TILE);
                        return;
                    }
                    g.setColor(tileColor);
                    g.fillRect(getX(), getY(), TILE, TILE);

                    drawChessFiguer(g, getX(), getY());
                }
            }
        }
    }

    public class CellPane extends JPanel {

         Color defaultBackground;

        public CellPane() {
            addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                	int x = e.getX();
                    int y = e.getY();

                    selectedRow = y / TILE;
                    selectedCol = x / TILE;
                    System.out.println(selectedRow + " " + selectedCol);
                    updateUI();
             
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    if (MouseClick == true) {
                        setBackground(Color.RED);
                    } else {
                        setBackground(Color.BLUE);
                        
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //setBackground(defaultBackground);
                    if (MouseClick) {
                    	MouseClick = false;
                    } else {
                    	MouseClick = true;
                    }

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //setBackground(defaultBackground);
                }

                @Override
                public void mouseExited(MouseEvent e) {


                }
            });
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(50, 50);
        }
    }
    
    public void move() {
        if (pieeceSelected) {


            if (board[currentRow][curretCol].isMoveActionValid(selectedRow, selectedCol)) {
                pieeceSelected = false;
                board[currentRow][curretCol].move(selectedRow, selectedCol);

                if (currentPlayerColor == PieceColor.WHITE) {
                    currentPlayerColor = PieceColor.BLACK;
                } else {
                    currentPlayerColor = PieceColor.WHITE;
                }

            }

        }
    }
    
    public void drawChessFiguer(Graphics g, int tileX, int tileY) {

        if (board[tileY / 50][tileX / 50] != null) {
            BufferedImage myPicture = null;

            try {
                myPicture = ImageIO.read(new File(board[tileY / 50][tileX / 50].getImage()));

            } catch (IOException | NullPointerException ex) {
                ex.printStackTrace();
            }
            g.drawImage(myPicture, tileX, tileY, null);
        }
    }
    
    public void attack() {
        if (pieeceSelected) {


            if (board[currentRow][curretCol].isAttackValid(selectedRow, selectedCol) &&
                    board[currentRow][curretCol].isSomethingToTake(selectedRow,selectedCol)
            ) {
            	pieeceSelected = false;
            	
                if(currentPlayerColor==PieceColor.WHITE){
                    GameBoard.whitePoints+=board[selectedRow][selectedCol].getPoints();
                } else  {GameBoard.blackPoints+=board[selectedRow][selectedCol].getPoints();}
                board[currentRow][curretCol].attack(selectedRow, selectedCol);

                if (currentPlayerColor == PieceColor.WHITE) {
                    currentPlayerColor = PieceColor.BLACK;
                } else {
                    currentPlayerColor = PieceColor.WHITE;
                }

            }

        }
    }

}
