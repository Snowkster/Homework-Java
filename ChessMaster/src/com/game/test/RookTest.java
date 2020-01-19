package com.game.test;

import com.chess.config.PieacesColor;
import com.game.pieaces.Rook;

public class RookTest {
	public static void ifThisMetodPossibleToMoveThePieceCorrectlyRook() {
		System.out.println("ifThisMetodPossibleToMoveThePieceCorrectlyRook");
		
		Rook testRook	=	new Rook(PieacesColor.BLACK,0,0);
		boolean isValid = testRook.isMovePossible(0, 2);
		String testMessage	=	(isValid) ? "Valid" : "Fail";
		System.out.println(testMessage);
		}
	public static void ifMoveOneSquereDiagonalNotPosible() {
		System.out.println("ifMoveOneSquereDiagonalNotPosible");
		
		Rook testRook = new Rook(PieacesColor.BLACK,1,1);
		boolean isValid = (testRook.isMovePossible(0, 2)	 ==		false);
		String testMassage =	(isValid) ? "Valid" : "Fail";
		System.out.println(testMassage);
		
		}
	public static void run() {
		ifThisMetodPossibleToMoveThePieceCorrectlyRook();
		ifMoveOneSquereDiagonalNotPosible();	
	}
	

}
