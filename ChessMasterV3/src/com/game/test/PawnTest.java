package com.game.test;

import com.game.pieaces.Pawn;

import java.util.Scanner;

import com.chess.config.PieacesColor;
public class PawnTest extends InputsValues{

	public static void ifTheMoveMethodPositionThePieceCorrectlyPawn() {
			System.out.println("Inputs values for where Pawn is:");
			Scanner inp = new Scanner(System.in);
			row = inp.nextInt();
			col = inp.nextInt();
		// 1. Arrange
		Pawn testPawn = new Pawn(PieacesColor.BLACK, row, col);
			System.out.println("Inputs values for where Pawn move:");
			moveRow= inp.nextInt();
			moveCol = inp.nextInt();
		//2. act - assert
		boolean isValid = testPawn.isMovePossible(moveRow, moveCol);
		String testMessage = (isValid) ? "Valid" : "Fail";
		System.out.println(testMessage);
		
	}
	public static void ifMoveOverTwoSquereIsNotPosible() {
		System.out.println("testIfMoveOverTwoSquereIsNotPosible");
		
		Pawn testPawn = new Pawn(PieacesColor.BLACK, row, col);
		
		boolean isValid = (testPawn.isMovePossible(moveRow, moveCol)	==	false);
		String testMessage = (isValid) ? "Valid" : "Fail";
		System.out.println(testMessage);
		
	}
	
	public static void run() {
		ifTheMoveMethodPositionThePieceCorrectlyPawn();
		ifMoveOverTwoSquereIsNotPosible();
	}
	
}
