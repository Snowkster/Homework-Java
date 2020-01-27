package com.game.pieaces;
public class Rook extends Peice{

	public Rook(String color, int row, int col){
		super(color, row, col);
		this.power  =	5;
		this.id		=	2;	
		
	}
	public boolean isMovePossible(int moveRow,int moveCol) {
		
		int moveRowCoeficent = (this.row - moveRow);
		int moveColCoeficent =	(this.col - moveCol);
	
		boolean isRowMovingPossible	=	(moveRowCoeficent ==	0);
		boolean isColMovingPossible	=	(moveColCoeficent <=	9);
		
		return isRowMovingPossible && isColMovingPossible;
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