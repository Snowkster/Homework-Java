package com.game.pieaces;

public class Chudaka extends Peice 
					 implements Blastable{

	public Chudaka(String color, int row, int col) {
		super(color, row, col);
		this.power = 15;
		this.id = 7;
	}
public boolean isMovePossible(int moveRow, int moveCol) {
		
		int moveRowCoeficient	=	(this.row - moveRow);
		int moveColCoeficient	=	(this.col - moveCol);
		
		boolean isRowMovementPossible = (moveRowCoeficient == 1);
		boolean isColMovementPossible = (moveColCoeficient == 0);
		
		return isRowMovementPossible && isColMovementPossible;
		
	}

	@Override
	public void move(int moveRow, int moveCol) {
        if(this.isMovePossible(moveRow, moveCol)) {
			
			this.row	=	moveRow;
			this.col	=	moveCol;		
		}
		
	}

	@Override
	public void attack(int attackRow, int attackCol) {
		this.row = attackRow;
		this.col = attackCol;
		int attackRowMove = (this.row - attackRow);
		int attackColMove = (this.row - attackCol);
		if (attackRow == 1 && attackCol > 1) {
			
		}else {
			System.out.println("Attack is not possible!");
		}
		
	}
	@Override
	public void blast(int row, int col) {
		
		
	}

}
