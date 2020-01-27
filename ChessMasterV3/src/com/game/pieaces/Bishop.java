package com.game.pieaces;
public class Bishop extends Peice{

public 	Bishop(String color, int row, int col){
		super(color, row, col);
		this.power  =	5;
		this.id		=	3;	
	}
public boolean isMovePossible(int moveRow, int moveCol) {
	
	int moveRowCoeficient	=	(this.row - moveRow);
	int moveColCoeficient	=	(this.col + moveCol);
	
	boolean isRowMovementPossible = (moveRowCoeficient	== 	1	||	moveRowCoeficient	==	0);
	boolean isColMovementPossible = (moveColCoeficient 	== 	1	||	moveColCoeficient	==	0);
	
	return isRowMovementPossible && isColMovementPossible;
	}

public void move(int moveRow, int moveCol) {
	
	if(this.isMovePossible(moveRow, moveCol)) {
		
		this.row	=	moveRow;
		this.col	=	moveCol;		
		}
	}
@Override
public void attack(int attackRow, int attackCol) {
	// TODO Auto-generated method stub
	
}
}

