package com.game.test;

import com.game.pieaces.Pawn;
import com.chess.config.PieacesColor;
public class PawnTest {

	public static void ifTheMoveMethodPositionThePieceCorrectlyPawn() {
		System.out.println("testIfTheMoveMethodPositionThePieceCorrectlyPawn");
	
		// 1. Arrange
		Pawn testPawn = new Pawn(PieacesColor.BLACK, 8, 0);
		
		//2. act - assert
		boolean isValid = testPawn.isMovePossible(7, 0);
		String testMessage = (isValid) ? "Valid" : "Fail";
		System.out.println(testMessage);
		
	}
	public static void ifMoveOverTwoSquereIsNotPosible() {
		System.out.println("testIfMoveOverTwoSquereIsNotPosible");
		
		Pawn testPawn = new Pawn(PieacesColor.BLACK, 8, 0);
		
		boolean isValid = (testPawn.isMovePossible(6, 0)	==	false);
		String testMessage = (isValid) ? "Valid" : "Fail";
		System.out.println(testMessage);
		
	}
	
	public static void run() {
		ifTheMoveMethodPositionThePieceCorrectlyPawn();
		ifMoveOverTwoSquereIsNotPosible();
	}
	
}
