package com.game.test;

import com.chess.config.PieacesColor;
import com.game.pieaces.King;

public class KingTest {
	public static void ifTheMoveMethodPositionThePieceCorrectlyKing() {
		System.out.println("testIfTheMoveMethodPositionThePieceCorrectlyKing");
		
		King testKing	=	new	King(PieacesColor.BLACK, 1, 5);
		boolean	isValid	=	testKing.isMovePossible(1, 5);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
		System.out.println(testMessage);
		
	}
	public static void ifMoveOverTwoSquereIsNotPosible() {
		System.out.println("testIfMoveOverTwoSquereIsNotPosible");
		
		King	testKing	=	new	King(PieacesColor.BLACK,0,5);
		boolean isValid	=	(testKing.isMovePossible(2, 5) == 	false);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
		System.out.println(testMessage);
	}
	public static void run() {
		
		ifTheMoveMethodPositionThePieceCorrectlyKing();
		ifMoveOverTwoSquereIsNotPosible();
	}
}
				