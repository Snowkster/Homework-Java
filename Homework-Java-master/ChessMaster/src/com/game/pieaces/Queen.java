package com.game.pieaces;
public class Queen {

	
	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;
	public Queen(String color,int row, int col){
		
		this.row	=	row;
		this.col	=	col;
		this.color = color;
		this.power  =	10;
		this.id		=	5;
		
	}
	public boolean isMovePossible(int moveRow, int moveCol) {
		
		int moveRowCoeficient	=	(this.row - moveRow);
		int moveColCoeficient	=	(this.col - moveCol);
		
		boolean isRowMovementPossible = (moveRowCoeficient <= 9);
		boolean isColMovementPossible = (moveColCoeficient <= 9);
		
		return isRowMovementPossible && isColMovementPossible;
		
	}
	
	
	public void move(int moveRow, int moveCol) {
	
		if(this.isMovePossible(moveRow, moveCol)) {
			
			this.row	=	moveRow;
			this.col	=	moveCol;		
		}
	}
}
