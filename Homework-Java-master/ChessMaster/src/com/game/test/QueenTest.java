package com.game.test;

import com.chess.config.PieacesColor;
import com.game.pieaces.Queen;

public class QueenTest {
	public static void ifTheMoveMethodPositionThePieceCorrectlyQeen() {
		System.out.println("ifTheMoveMethodPositionThePieceCorrectlyQeen");

		Queen testQueen		=	new Queen(PieacesColor.BLACK, 0, 4);
		boolean isValid 	=	testQueen.isMovePossible(4, 0);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
		System.out.println(testMessage);
		
}
	public static void run() {
		ifTheMoveMethodPositionThePieceCorrectlyQeen();
		}
	}
