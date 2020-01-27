package com.game.test;

import java.util.Scanner;

import com.chess.config.PieacesColor;
import com.game.pieaces.Queen;

public class QueenTest extends InputsValues{
	public static void ifTheMoveMethodPositionThePieceCorrectlyQeen() {
			System.out.println("Inputs values for where Qeen is:");
			Scanner inp = new Scanner(System.in);
			row = inp.nextInt();
			col = inp.nextInt();
		Queen testQueen		=	new Queen(PieacesColor.BLACK, row, col);
			System.out.println("Inputs values for where Qeen move:");
			moveRow= inp.nextInt();
			moveCol = inp.nextInt();
		boolean isValid 	=	testQueen.isMovePossible(moveRow, moveCol);
		String testMessage	=	(isValid)	?	"Valid"	:	"Fail";
		System.out.println(testMessage);
		
}
	public static void run() {
		ifTheMoveMethodPositionThePieceCorrectlyQeen();
		}
	}
