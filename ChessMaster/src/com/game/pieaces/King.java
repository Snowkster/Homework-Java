package com.game.pieaces;
public class King {

	
	public String color;
	public int power;
	public int id;
	public int row;
	public int col;
	
	public	King(String color,int row,  int col){
		
		this.row	=	row;
		this.col	=	col;
		this.color  =   color;
		this.power  =	6;
		this.id		=	6;	
	}
	public boolean isMovePossible(int moveRow, int moveCol) {
		
		int moveRowCoeficient	=	(this.row - moveRow);
		int moveColCoeficient	=	(this.col - moveCol);
		
		boolean isRowMovementPossible = (moveRowCoeficient == 0	|| moveRowCoeficient	==	1);
		boolean isColMovementPossible = (moveColCoeficient == 1	||	moveColCoeficient	==	0);
		
		return isRowMovementPossible && isColMovementPossible;
		
	}
	
	
	public void move(int moveRow, int moveCol) {
	
		if(this.isMovePossible(moveRow, moveCol)) {
			
			this.row	=	moveRow;
			this.col	=	moveCol;		
		}
	}
}
