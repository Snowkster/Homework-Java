package com.game.test;

import java.util.Scanner;

import com.chess.config.PieacesColor;
import com.game.pieaces.Knight;

public class KnightTest extends InputsValues{
	
	public static void ifTheMoveMethodPositionThePieceCorrectlyKnight() {
			System.out.println("Inputs values for where Knight is:");
			Scanner inp = new Scanner(System.in);
			row = inp.nextInt();
			col = inp.nextInt();
		Knight testKnight	=	new	Knight(PieacesColor.WHITE, row, col);
			System.out.println("Inputs values for where Qeen move:");
			moveRow= inp.nextInt();
			moveCol = inp.nextInt();
		boolean isValid	=	testKnight.isMovePossible(moveRow, moveCol);
		
	String testMessage	=	(isValid) ? "Valid"	:	"Fail";
	System.out.println(testMessage);
	}
	public static void ifMoveOverOneSquereIsNotPosible() {
		System.out.println("ifMoveOverOneSquereIsNotPosible");
		Knight	testKnight	=	new	Knight(PieacesColor.WHITE, row, col);
		
		boolean isValid	=	(testKnight.isMovePossible(moveRow, moveCol)	==	false);
		
		String	testMessage	=	(isValid)	?	"Valid"	:	"Fail";
		System.out.println(testMessage);
		
		}
	public static void run() {
		ifTheMoveMethodPositionThePieceCorrectlyKnight();
		ifMoveOverOneSquereIsNotPosible();
	}

}
