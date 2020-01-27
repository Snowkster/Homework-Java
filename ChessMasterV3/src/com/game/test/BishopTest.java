package com.game.test;

import java.util.Scanner;

import com.chess.config.PieacesColor;
import com.game.pieaces.Bishop;

public class BishopTest extends InputsValues{
	
public static void	ifTheMoveMethodPositionThePieceCorrectlyBishop() {
			System.out.println("Inputs values for where Pawn is:");
			Scanner inp = new Scanner(System.in);
			row = inp.nextInt();
			col = inp.nextInt();
	Bishop testBishop =	new Bishop(PieacesColor.WHITE, row , col);
			System.out.println("Inputs values for where Pawn move:");
			moveRow= inp.nextInt();
			moveCol = inp.nextInt();
	boolean isValid = testBishop.isMovePossible(moveRow, moveCol);
	String testMessage	=	(isValid) ? "Valid" : "Fail";
	System.out.println(testMessage);
	
	}
public static void ifMoveOverOneSquereIsNotPossible() {
	System.out.println("ifMoveOverOneSquereIsNotPossible");	
	
	Bishop testBishop	=	new Bishop(PieacesColor.WHITE,	row, col);
		
	boolean isValid	=	(testBishop.isMovePossible(moveRow, moveCol)	==	false);
	String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
	System.out.println(testMessage);
	}
public static void run() {

	ifTheMoveMethodPositionThePieceCorrectlyBishop();
	ifMoveOverOneSquereIsNotPossible();
}


}
