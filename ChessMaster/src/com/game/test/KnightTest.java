package com.game.test;

import com.chess.config.PieacesColor;
import com.game.pieaces.Knight;

public class KnightTest {
	
	public static void ifTheMoveMethodPositionThePieceCorrectlyKnight() {
		System.out.println("ifTheMoveMethodPositionThePieceCorrectlyKnight");
		
		Knight testKnight	=	new	Knight(PieacesColor.WHITE, 0, 1);
		
		boolean isValid	=	testKnight.isMovePossible(2, 2);
		
	String testMessage	=	(isValid) ? "Valid"	:	"Fail";
	System.out.println(testMessage);
	}
	public static void ifMoveOverOneSquereIsNotPosible() {
		System.out.println("ifMoveOverOneSquereIsNotPosible");
		Knight	testKnight	=	new	Knight(PieacesColor.WHITE,0,1);
		
		boolean isValid	=	(testKnight.isMovePossible(1,1)	==	false);
		
		String	testMessage	=	(isValid)	?	"Valid"	:	"Fail";
		System.out.println(testMessage);
		
		}
	public static void run() {
		ifTheMoveMethodPositionThePieceCorrectlyKnight();
		ifMoveOverOneSquereIsNotPosible();
	}

}
