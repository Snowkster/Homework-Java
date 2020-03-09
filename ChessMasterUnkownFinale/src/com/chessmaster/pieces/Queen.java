package com.chessmaster.pieces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.chessmaster.config.PieceColor;
import com.chessmaster.manager.GameBoard;

public class Queen extends Piece {
	
	
	public Queen(String color, int row, int col) {
		
		super(color, "Q", row, col);
		this.power  = 10;
		this.id 	= 6;
	}

	@Override
	public void move(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int row, int col) {
		   if (isAttackValid(row, col)) {
	            System.out.println("Attack made");
	            GameBoard.board[row][col] = GameBoard.board[this.row][this.col];
	            GameBoard.board[this.row][this.col] = null;
	            this.row = row;
	            this.col = col;
	        }
		
	}
	
	public boolean isAttackValid(int moveRow, int moveCol) {

        if (moveCol > 9 || moveCol < 0) {
            return false;
        }
        if (moveRow > 9 || moveRow < 0) {
            return false;
        }
		return false;
	}

	@Override
	public boolean isMoveActionValid(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean isSomethingToTake(int moveRow, int moveCol) {
		if (GameBoard.board[moveRow][moveCol] != null
				&& GameBoard.board[moveRow][moveCol].color != this.color){
			return  true;}
		
		return false;
	}

    public String getImage() {
    	String filePath= "";
    	if(this.color==PieceColor.WHITE) {
    		filePath="picks/QueenW.png";
    	} else {
    		filePath="picks/QueenB.png";
    	}
		return filePath;
       
    }
}