package com.chessmaster.pieces;

import com.chessmaster.manager.GameBoard;

public class Chudaka 
			extends Piece 
			implements Blastable {
	
	public Chudaka(String color, int row, int col) {
		
		super(color, "Cd", row, col);
		this.power 	= 15;
		this.id 	= 7;
	}
	
	@Override
	public void move(int row, int col) {
		if(isMoveActionValid(row, col)) {
			
			this.row = row;
			this.col = col;
		}
		
	}

	@Override
	public void attack(int row, int col) {
		
		
	}

	@Override
	public void blast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMoveActionValid(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
