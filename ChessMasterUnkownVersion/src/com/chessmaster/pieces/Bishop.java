package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;

public class Bishop extends Piece {
	
	public Bishop(String color, int row, int col) {
		
		super(color,"B",  row, col);
		this.power  = 5;
		this.id 	= 2;
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
    		filePath="picks/BishopW.png";
    	} else {
    		filePath="picks/BishopB.png";
    	}
		return filePath;
       
    }
}
