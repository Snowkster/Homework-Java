package com.game.pieaces;
public class Pawn extends Peice{


	public Pawn(String color, int row, int col){
		super(color, row, col);
		this.power  =	1;
		this.id		=	1;		
	}
	
	public boolean isMovePossible(int moveRow, int moveCol) {
		
		int moveRowCoeficient	=	(this.row - moveRow);
		int moveColCoeficient	=	(this.col - moveCol);
		
		boolean isRowMovementPossible = (moveRowCoeficient == 1);
		boolean isColMovementPossible = (moveColCoeficient == 0);
		
		return isRowMovementPossible && isColMovementPossible;
		
	}
	
	
	public void move(int moveRow, int moveCol) {
	
		if(this.isMovePossible(moveRow, moveCol)) {
			
			this.row	=	moveRow;
			this.col	=	moveCol;		
		}
	}
	
	public void attack() {
		
		
	}

	@Override
	public void attack(int attackRow, int attackCol) {
		// TODO Auto-generated method stub
		
	}
}

