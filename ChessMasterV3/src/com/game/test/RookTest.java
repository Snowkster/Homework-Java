package com.game.test;

import java.util.Scanner;

import com.chess.config.PieacesColor;
import com.game.pieaces.Rook;

public class RookTest extends InputsValues{
	public static void ifThisMetodPossibleToMoveThePieceCorrectlyRook() {
			System.out.println("Inputs values for where Pawn is:");
			Scanner inp = new Scanner(System.in);
			row = inp.nextInt();
			col = inp.nextInt();
		Rook testRook	=	new Rook(PieacesColor.BLACK, row, col);
			System.out.println("Inputs values for where Pawn move:");
			moveRow= inp.nextInt();
			moveCol = inp.nextInt();
		boolean isValid = testRook.isMovePossible(moveRow, moveCol);
		String testMessage	=	(isValid) ? "Valid" : "Fail";
		System.out.println(testMessage);
		}
	public static void ifMoveOneSquereDiagonalNotPosible() {
		System.out.println("ifMoveOneSquereDiagonalNotPosible");
		
		Rook testRook = new Rook(PieacesColor.BLACK, row, col);
		boolean isValid = (testRook.isMovePossible(moveRow, moveCol)	 ==		false);
		String testMassage =	(isValid) ? "Valid" : "Fail";
		System.out.println(testMassage);
		
		}
	public static void run() {
		ifThisMetodPossibleToMoveThePieceCorrectlyRook();
		ifMoveOneSquereDiagonalNotPosible();	
	}
	

}
