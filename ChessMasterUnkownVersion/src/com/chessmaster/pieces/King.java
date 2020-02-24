package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;

public class King extends Piece {
	
	public King(String color, int row, int col) {
		
		super(color, "K", row, col);
		this.power  = 6;
		this.id 	= 5;
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