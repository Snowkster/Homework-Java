package com.game.test;

import com.chess.config.PieacesColor;
import com.game.pieaces.Bishop;

public class BishopTest {
	
public static void	ifTheMoveMethodPositionThePieceCorrectlyBishop() {
	System.out.println("ifTheMoveMethodPositionThePieceCorrectlyBishopl");
	
	Bishop testBishop =	new Bishop(PieacesColor.WHITE,2 , 0);
	
	boolean isValid = testBishop.isMovePossible(1, 1);
	String testMessage	=	(isValid) ? "Valid" : "Fail";
	System.out.println(testMessage);
	
	}
public static void ifMoveOverOneSquereIsNotPossible() {
	System.out.println("ifMoveOverOneSquereIsNotPossible");	
	
	Bishop testBishop	=	new Bishop(PieacesColor.WHITE,	0,	2);
		
	boolean isValid	=	(testBishop.isMovePossible(1, 2)	==	false);
	String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
	System.out.println(testMessage);
	}
public static void run() {

	ifTheMoveMethodPositionThePieceCorrectlyBishop();
	ifMoveOverOneSquereIsNotPossible();
}


}
