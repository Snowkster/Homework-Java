package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;
import com.chessmaster.manager.GameBoard;

public class King extends Piece {
	
	public King(String color, int row, int col) {
		
		super(color, "K", row, col);
		this.power  = 6;
		this.id 	= 5;
	}

	@Override
	public void move(int row, int col) {
		if(isMoveActionValid(row, col)) {
			System.out.println("Is move!");
			GameBoard.board[row][col] = GameBoard.board[this.row][this.col];
			GameBoard.board[this.row][this.col] = null;
			this.row = row;
			this.col = col;
		}
		
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
    		filePath="picks/KingW.png";
    	} else {
    		filePath="picks/KingB.png";
    	}
		return filePath;
       
    }
}