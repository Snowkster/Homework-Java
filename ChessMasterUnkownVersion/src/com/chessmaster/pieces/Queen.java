package com.chessmaster.pieces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.chessmaster.config.PieceColor;

public class Queen extends Piece {
	
	
	public Queen(String color, int row, int col) {
		
		super(color, "Q", row, col);
		this.power  = 10;
		this.id 	= 6;
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
    		filePath="picks/QueenW.png";
    	} else {
    		filePath="picks/QueenB.png";
    	}
		return filePath;
       
    }
}