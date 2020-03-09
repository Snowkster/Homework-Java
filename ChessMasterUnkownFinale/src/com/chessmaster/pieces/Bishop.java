package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;
import com.chessmaster.manager.GameBoard;

public class Bishop extends Piece {
	
	public Bishop(String color, int row, int col) {
		
		super(color,"B",  row, col);
		this.power  = 5;
		this.id 	= 2;
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
		if( col > 9 || col < 0){return false;}
		if( row > 9 || row < 0){return false;}


		int moveRow = Math.abs(this.row - row);
		int moveCol = Math.abs(this.col - col);


		if(	isSomethingBlockingTheWay(moveRow,moveCol) == false) {
			//System.out.println("Something is blocking the way.");
			//return false;
		}
		return false;
	}
	
	
	
	public String getImage() {
    	String filePath= "";
    	if(this.color==PieceColor.WHITE) {
    		filePath="picks/BishopW.png";
    	} else {
    		filePath="picks/BishopB.png";
    	}
		return filePath;
       
    }
	
	public boolean isSomethingToTake(int moveRow, int moveCol) {
		if (GameBoard.board[moveRow][moveCol] != null
				&& GameBoard.board[moveRow][moveCol].color != this.color){
			return  true;}
		
		return false;
	}
}
