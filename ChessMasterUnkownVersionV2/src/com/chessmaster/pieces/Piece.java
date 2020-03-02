package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;
import com.chessmaster.manager.GameBoard;

public abstract class Piece {
	
	
	public String color;
	protected int power;
	protected int id;
	
	protected int row;
	protected int col;
	
	protected  int points = 10;

	protected String signature;
	
	public Piece(String color, String signature, int row, int col) {
		
		this.color 	= color;
		this.row 	= row;
		this.col 	= col;
		this.signature = signature;
	}
	
	public Piece(String color) {
		
		this.color 	= color;
		this.row 	= 0;
		this.col 	= 0;
	}
	
    public void setRow(int row) {
		
		if(row >= 0 && row <= 9) {
			this.row = row;
		}
	}
	
	public int getRow() {
		return this.row;
	}
	
	public void setCol(int col) {
		
		if(col >= 0 && col <= 9) {
			this.col = col;
		}
	}	

	
	public int getCol() {
		return this.col;
	}
	
	public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    int posicion(int value, int min, int max) {
        if (value <= min) return min;
        if (value >= max) return max;
        return value;
    }
    
    
    public boolean isSomethingBlockingTheWay(int moveRow, int moveCol) {
        int row = posicion(moveRow - this.row, -1, 1);
        int col = posicion(moveCol - this.col, -1, 1);

        while (true) {

            try {
                if (GameBoard.board[moveRow][moveCol] != null) {
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }

            moveRow = moveRow - row;

            moveCol = moveCol - col;
            if (moveRow == this.row && moveCol == this.col) {

                break;
            }
            try {
                if (GameBoard.board[moveRow][moveCol] != null) {
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }


        }

        return true;
    }
    
    public boolean isSomethingToTake(int moveRow, int moveCol) {
		if (GameBoard.board[moveRow][moveCol] != null
				&& GameBoard.board[moveRow][moveCol].color != this.color){
			return  true;}
		
		return false;
	}
	
	public abstract String getImage ();
	
	public String getSignature() {
		
		return (this.color == PieceColor.WHITE) 
				? ("w" + this.signature)
			    : ("b" + this.signature);
	}
	
	public boolean isAttackValid(int moveRow, int moveCol) {
        return true;
    }
	
	public abstract boolean isMoveActionValid(int row, int col);
	
	public void move(int row, int col) {
		
		if(isMoveActionValid(row, col)) {
			
			this.row = row;
			this.col = col;
		}
	}
	
	
	public abstract void attack(int row, int col);
}