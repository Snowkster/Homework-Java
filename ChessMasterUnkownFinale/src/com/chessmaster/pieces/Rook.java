package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;
import com.chessmaster.manager.GameBoard;

public class Rook extends Piece {
	
	public Rook(String color, int row, int col) {
		
		super(color, "R", row, col);
		this.power  = 5;
		this.id 	= 4;
	}

	@Override
	public void move(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int row, int col) {
		// TODO Auto-generated method stub
		
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
    		filePath="picks/RookW.png";
    	} else {
    		filePath="picks/RookB.png";
    	}
		return filePath;
       
    }
}