package com.game.pieaces;
public class Knight {

	
	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;
public	Knight(String color, int row, int col){
		
		this.row	=	row;
		this.col	=	col;
		this.color 	=	color; 
		this.power  =	6;
		this.id		=	4;	
	}
public boolean isMovePossible(int moveRow, int moveCol) {
	
	int moveRowCoeficient	=	(this.row - moveRow);
	int moveColCoeficient	=	(this.col + moveCol);
	
	boolean isRowMovementPossible = ( moveRowCoeficient == 0	||	moveRow	==	2);
	boolean isColMovementPossible = ( moveColCoeficient == 1	||	moveCol	==	2);
	
	return isRowMovementPossible && isColMovementPossible;
	
}


public void move(int moveRow, int moveCol) {

	if(this.isMovePossible(moveRow, moveCol)) {
		
		this.row	=	moveRow;
		this.col	=	moveCol;		
		}
	}
}
