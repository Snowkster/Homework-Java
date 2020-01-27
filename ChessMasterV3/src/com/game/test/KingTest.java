package com.game.test;

import java.util.Scanner;

import com.chess.config.PieacesColor;
import com.game.pieaces.King;

public class KingTest extends InputsValues{
	public static void ifTheMoveMethodPositionThePieceCorrectlyKing() {
			System.out.println("Inputs values for where King is:");
			Scanner inp = new Scanner(System.in);
			row = inp.nextInt();
			col = inp.nextInt();
		King testKing	=	new	King(PieacesColor.BLACK, row, col);
			System.out.println("Inputs values for where King move:");
			moveRow= inp.nextInt();
			moveCol = inp.nextInt();
		boolean	isValid	=	testKing.isMovePossible(moveRow, moveCol);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
		System.out.println(testMessage);
		
	}
	public static void ifMoveOverTwoSquereIsNotPosible() {
		System.out.println("testIfMoveOverTwoSquereIsNotPosible");
		
		King	testKing	=	new	King(PieacesColor.BLACK, row, col);
		boolean isValid	=	(testKing.isMovePossible(moveRow, moveCol) == 	false);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
		System.out.println(testMessage);
	}
	public static void run() {
		
		ifTheMoveMethodPositionThePieceCorrectlyKing();
		ifMoveOverTwoSquereIsNotPosible();
	}
}
				